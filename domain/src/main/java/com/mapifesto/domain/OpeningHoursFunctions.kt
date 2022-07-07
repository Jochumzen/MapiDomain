package com.mapifesto.domain

import ch.poole.openinghoursparser.*
import ch.poole.openinghoursparser.TimeSpan.UNDEFINED_TIME
import java.io.ByteArrayInputStream
import java.util.*

enum class RuleResult {
    RULE_FAILED, NOT_APPLICABLE, TWENTY_FOUR_SEVEN, YEAR_RULE_OPEN, YEAR_RULE_CLOSED, WEEKS_RULE_OPEN, WEEKS_RULE_CLOSED, DATES_RULE_OPEN, DATES_RULE_CLOSED, DAYS_RULE_OPEN, DAYS_RULE_CLOSED, TIMES_RULE_OPEN, TIMES_RULE_CLOSED, MODIFIER_OFF
}

enum class RuleCase {
    NO_CASE, NOT_APPLICABLE, APPLY
}

fun List<Rule>.evaluate(current: Date): Boolean? {
    val calendar = Calendar.getInstance()
    calendar.time = current
    val dayOfWeekSuIs1 = calendar.get(Calendar.DAY_OF_WEEK)  //Su = 1... Sa = 7
    val dayOfWeekMoIs0 = if (dayOfWeekSuIs1 == 1) 6 else dayOfWeekSuIs1 - 2  //Mo = 0, Tu = 1,.. Su = 6
    val currentTime = calendar.get(Calendar.AM_PM)*720 + calendar.get(Calendar.HOUR)*60 + calendar.get(Calendar.MINUTE)
    val year = calendar.get(Calendar.YEAR)
    val month = calendar.get(Calendar.MONTH)
    val week = calendar.get(Calendar.WEEK_OF_YEAR)
    val date = calendar.get(Calendar.DATE)

    //results is a list of RuleResult (see above), one for each rule.
    val results = this.map { it.evaluate(dayOfWeekMoIs0, currentTime, year, month, week, date)}

    // If any of the rules failed, return null
    if(results.any {it == RuleResult.RULE_FAILED})
        return null

    if(results.any {it == RuleResult.YEAR_RULE_CLOSED})
        return false

    if(results.any {it == RuleResult.YEAR_RULE_OPEN})
        return true

    if(results.any {it == RuleResult.WEEKS_RULE_CLOSED})
        return false

    if(results.any {it == RuleResult.WEEKS_RULE_OPEN})
        return true

    if(results.any {it == RuleResult.DATES_RULE_CLOSED})
        return false

    if(results.any {it == RuleResult.DATES_RULE_OPEN})
        return true

    if(results.any {it == RuleResult.DAYS_RULE_CLOSED})
        return false

    if(results.any {it == RuleResult.DAYS_RULE_OPEN})
        return true

    if(results.any {it == RuleResult.TIMES_RULE_CLOSED})
        return false

    if(results.any {it == RuleResult.TIMES_RULE_OPEN})
        return true

    if(results.any {it == RuleResult.TWENTY_FOUR_SEVEN})
        return true

    return false
}

fun Rule.evaluate(dayOfWeekParser: Int, currentTime: Int, year: Int, month: Int, week: Int, date: Int): RuleResult
{

    //If twentyfourseven is true, then ignore everything else in the rule.
    if(isTwentyfourseven)
        return RuleResult.TWENTY_FOUR_SEVEN

    //Do not handle rules where additive is true
    if(isAdditive)
        return RuleResult.RULE_FAILED

    //Do not handle rules with holidays
    if(holidays != null)
        return RuleResult.RULE_FAILED

    //times is List<YearRange>. Make sure that each YearRange is OK.
    years?.let { years ->

        if (years.map { it.startYear < 0 || it.interval != 0 }.any {it})
            return RuleResult.RULE_FAILED
    }

    //weeks is List<WeekRange>. Make sure that each WeekRange is OK.
    weeks?.let { weeks ->

        if (weeks.map { it.startWeek < 0 || it.interval != 0 }.any {it})
            return RuleResult.RULE_FAILED
    }

    //dates is List<DateRange>. Make sure that each DateRange is OK.
    dates?.let { dates ->

        if (dates.map { it.interval != 0 || !it.startDate.okToUseToDetermineOpen || it.endDate?.okToUseToDetermineOpen != true }.any {it})
            return RuleResult.RULE_FAILED
    }

    //days is List<WeekDayRange>. Make sure that each WeekDayRange is OK.
    days?.let { days ->

        if (days.map { it.nths != null || it.offset != 0  }.any {it})
            return RuleResult.RULE_FAILED
    }

    //times is List<TimeSpan>. Make sure that each TimeSpan is OK.
    times?.let{ times ->

        //Does not handle event times (sunset,...), open-ended TimeSpan or intervals
        if (times.map { it.startEvent != null || it.endEvent != null || it.isOpenEnded || it.interval != 0 || it.start < 0 || it.end < 0}.any {it})
            return RuleResult.RULE_FAILED

    }


    //Create yearsRule, weeksRule, datesRule and daysRule
    // NO_CASE means that there is no YearRange, WeekRange, DateRange or WeekDayRange resp.
    // NOT_APPLICABLE means that the year/week/date/day does not fall into any of the YearRange / WeekRange / DateRange / WeekDayRange objects
    // APPLY means that the year/week/date/day does fall into at least one of the YearRange / WeekRange / DateRange / WeekDayRange objects

    val yearsRule = years ?.let {
        if (it.contains(year))
            RuleCase.APPLY
        else
            RuleCase.NOT_APPLICABLE
    } ?: RuleCase.NO_CASE

    val weeksRule = weeks?.let {
        if (it.contains(week))
            RuleCase.APPLY
        else
            RuleCase.NOT_APPLICABLE
    } ?: RuleCase.NO_CASE

    val datesRule = dates?.let {
        if (it.containsTime(year, month, date))
            RuleCase.APPLY
        else
            RuleCase.NOT_APPLICABLE
    } ?: RuleCase.NO_CASE

    val daysRule = if (days != null) {
        if (days!!.contains(dayOfWeekParser))
            RuleCase.APPLY
        else
            RuleCase.NOT_APPLICABLE
    } else
        RuleCase.NO_CASE


    //If *any* of yearsRule, weeksRule, datesRule and daysRule is NOT_APPLICABLE then the rule is NOT_APPLICABLE, time / modifier does not matter
    //Example "2019" in 2020, "Week 12-18 Off" in week 32, "Nov 12 10.00-18.00" and it is Nov 11 (at 12.00)
    if (yearsRule == RuleCase.NOT_APPLICABLE || weeksRule == RuleCase.NOT_APPLICABLE || datesRule == RuleCase.NOT_APPLICABLE || daysRule == RuleCase.NOT_APPLICABLE)
        return RuleResult.NOT_APPLICABLE

    //All rules are now either APPLY or NO_CASE

    //Now create timeRule. We do this after the previous check since it makes no difference if the timeRule apply if year/week/date/day does not
    val timesRule = if (times != null) {
        if (times!!.contains(currentTime))
            RuleCase.APPLY
        else
            RuleCase.NOT_APPLICABLE
    } else
        RuleCase.NO_CASE


    if (yearsRule == RuleCase.APPLY) {
        return if(timesRule == RuleCase.NOT_APPLICABLE) {
            //We have TimeSpans but none apply
            if(modifier?.modifier?.name == "OFF" || modifier?.modifier?.name == "CLOSED")
                RuleResult.NOT_APPLICABLE     // e.g. "2021 12:00-13:00 off" at 14:00 in 2021)
            else
                RuleResult.YEAR_RULE_CLOSED   // e.g. "2021 10:00-18:00" at 20:00 in 2021
        } else
        //timesRule is APPLY or NO_CASE
            if(modifier?.modifier?.name == "OFF" || modifier?.modifier?.name == "CLOSED")
                RuleResult.YEAR_RULE_CLOSED    // e.g. "2021 12:00-13:00 off" or "2021 off" at 12:30 in 2021
            else
                RuleResult.YEAR_RULE_OPEN   // e.g. "2021 10:00-18:00" or "2021" at 11:00 in 2021
    }


    //Same as year handling
    if (weeksRule == RuleCase.APPLY) {
        return if(timesRule == RuleCase.NOT_APPLICABLE) {
            //We have TimeSpans but none apply
            if(modifier?.modifier?.name == "OFF" || modifier?.modifier?.name == "CLOSED")
                RuleResult.NOT_APPLICABLE     // e.g. "Week 10-20 12:00-13:00 off" in week 15 at 14:00
            else
                RuleResult.WEEKS_RULE_CLOSED   // e.g. "Week 10-20 10:00-18:00" in week 15 at 20:00
        } else
        //timesRule is APPLY or NO_CASE
            if(modifier?.modifier?.name == "OFF" || modifier?.modifier?.name == "CLOSED")
                RuleResult.WEEKS_RULE_CLOSED    // e.g. "Week 10-20 12:00-13:00 off" or "Week 10-20 off" in week 15 at 12:30
            else
                RuleResult.WEEKS_RULE_OPEN   // e.g. "Week 10-20 10:00-18:00" in week 15 at 11:00
    }

    //Same as year handling
    if (datesRule == RuleCase.APPLY) {
        return if(timesRule == RuleCase.NOT_APPLICABLE) {
            //We have TimeSpans but none apply
            if(modifier?.modifier?.name == "OFF" || modifier?.modifier?.name == "CLOSED")
                RuleResult.NOT_APPLICABLE     // e.g. "Dec 24 12:00-13:00 off" on Dec 24 at 14:00
            else
                RuleResult.DATES_RULE_CLOSED   // e.g. "Dec 24 10:00-18:00" on Dec 24 at 20:00
        } else
        //timesRule is APPLY or NO_CASE
            if(modifier?.modifier?.name == "OFF" || modifier?.modifier?.name == "CLOSED")
                RuleResult.DATES_RULE_CLOSED    // e.g. "Dec 24 12:00-13:00 off" or "Dec 24 off" on Dec 24 at 12:30
            else
                RuleResult.DATES_RULE_OPEN   // e.g. "Dec 24 10:00-12:00" on Dec 24 at 11:00
    }

    if (daysRule == RuleCase.APPLY) {
        return if(timesRule == RuleCase.NOT_APPLICABLE) {
            if(modifier?.modifier?.name == "OFF" || modifier?.modifier?.name == "CLOSED")
                RuleResult.NOT_APPLICABLE     // e.g. "Mo 12:00-13:00 off" on a Mo at 14:00
            else
                RuleResult.DAYS_RULE_CLOSED   // e.g. "Mo 10:00-18:00" on a Mo at 13:00
        } else
            if(modifier?.modifier?.name == "OFF" || modifier?.modifier?.name == "CLOSED")
                RuleResult.DAYS_RULE_CLOSED    // e.g. "Mo 12:00-13:00 off" or "Mo off" on a Mo at 12:30
            else
                RuleResult.DAYS_RULE_OPEN   // e.g. "Mo 10:00-18:00" on a Mo at 11:00
    }

    //If we are here then yearsRule, weeksRule, datesRule and daysRule (as well as hollidays) are all null.
    if (timesRule != RuleCase.NO_CASE) {
        //APPLY or NOT_APPLICABLE
        return if(timesRule == RuleCase.NOT_APPLICABLE) {
            if(modifier?.modifier?.name == "OFF" || modifier?.modifier?.name == "CLOSED")
                RuleResult.NOT_APPLICABLE     // e.g. "12:00-13:00 off" at 12:30
            else
                RuleResult.TIMES_RULE_CLOSED   // e.g. "10:00-18:00 at 22:00
        } else
            if(modifier?.modifier?.name == "OFF" || modifier?.modifier?.name == "CLOSED")
                RuleResult.TIMES_RULE_CLOSED    // e.g. "12:00-13:00 off" at 12:30
            else
                RuleResult.TIMES_RULE_OPEN   // e.g. "10:00-18:00" at 11:00
    }

    //Here times is null as well.
    if(modifier?.modifier?.name == "OFF" || modifier?.modifier?.name == "CLOSED")
        return RuleResult.MODIFIER_OFF

    //E.g. "Open", "Unknown" or just a comment. Ignore the rule.
    return RuleResult.NOT_APPLICABLE

}

//Mo = 0, .. Su = 6
@JvmName("containsWeekDayRange")
fun List<WeekDayRange>.contains(dayOfWeek: Int) : Boolean {

    return this.map { it.contains(dayOfWeek)}.any { it }

}

fun WeekDayRange.contains(dayOfWeek: Int) : Boolean {
    return if(endDay == null) {
        startDay.ordinal == dayOfWeek
    } else {
        (startDay.ordinal <= dayOfWeek && endDay.ordinal >= dayOfWeek)
    }
}

@JvmName("containsTimeSpan")
fun List<TimeSpan>.contains(time: Int) : Boolean {

    return this.map { it.contains(time)}.any { it }
}

fun TimeSpan.contains(time: Int) : Boolean {
    return (time in start until end)
}

fun TimeSpan.openingHours(): Int? {
    return if (this.start != UNDEFINED_TIME) this.start/60 else null
}

fun TimeSpan.openingMinutes(): Int? {
    return if (this.start != UNDEFINED_TIME) this.start - openingHours()?.times(60)!! else null
}

fun TimeSpan.closingHours(): Int? {
    return if (this.end != UNDEFINED_TIME) this.end/60 else null
}

fun TimeSpan.closingMinutes(): Int? {
    return if (this.end != UNDEFINED_TIME) this.end - closingHours()?.times(60)!! else null
}

@JvmName("containsDateRange")
fun List<DateRange>.containsTime(year: Int, month: Int, date: Int) : Boolean {

    return this.map { it.contains(year, month, date)}.any { it }

}

fun DateRange.contains(year: Int, month: Int, day: Int) : Boolean {

    return if(endDate == null) {

        val yearOK = (startDate.year < 0 || startDate.year == year)
        val monthOK = (startDate.month.ordinal < 0 || startDate.month.ordinal == month)
        val dateOK = (startDate.day < 0 || startDate.day == day)

        yearOK && monthOK && dateOK

    } else {

        val startMonthOrdinal =  startDate.month.ordinal
        val endMonthOrdinal = if (endDate!!.month == null) startMonthOrdinal else endDate!!.month.ordinal

        val yearOK = (startDate.year < 0 || endDate!!.year < 0 || year in startDate.year..endDate!!.year)
        val monthOK = (startDate.month.ordinal < 0 || endMonthOrdinal < 0 || month in startMonthOrdinal..endMonthOrdinal)
        val dateOK = (startDate.day < 0 || endDate!!.day < 0 || day in startDate.day..endDate!!.day)

        yearOK && monthOK && dateOK
    }
}

@JvmName("containsYearRange")
fun List<YearRange>.contains(year: Int) : Boolean {

    return this.map { it.contains(year)}.any { it }

}

fun YearRange.contains(year: Int) : Boolean {

    return if (endYear > 0)
        year in startYear..endYear
    else
        year == startYear
}

@JvmName("containsWeekRange")
fun List<WeekRange>.contains(week: Int) : Boolean {

    return this.map { it.contains(week)}.any { it }

}

fun WeekRange.contains(week: Int) : Boolean {

    return if (endWeek > 0)
        week in startWeek..endWeek
    else
        week == startWeek
}

//Do not handle these five at the moment.
val DateWithOffset.okToUseToDetermineOpen: Boolean get() {
    return (!isOpenEnded && nthWeekDay == null && nth == 0 && weekDayOffset == null && dayOffset != 0)
}

/*fun List<WeekDayRange>.createOpeningHoursDays(): OpeningHoursDays? {
    //Return null if any WeekDayRange has nths or offset.
    return if (this.map { it.nths != null || it.offset != 0  }.any {it})
        null
    else{
        //Code
        OpeningHoursDays()

    }
}*/

// To be true, times must be non-null, while days may or may not be be null. Everything else must be null or 0
// Every TimeSpan must have a start and an end. It cannot have variable times, be open-ended or have an interval.
// Every WeekDayRange must be free of Nths and offset.
val Rule.canUseSimpleUi: Boolean get() {
    if( isFallBack || isAdditive || isTwentyfourseven || comment != null || years != null || weeks != null || dates != null || modifier != null)
        return false

    days?.let { days ->

        if (days.map { it.nths != null || it.offset != 0  }.any {it})
            return false

    }

    return times?.let { times ->
        !times.map { it.startEvent != null || it.endEvent != null || it.isOpenEnded || it.interval != 0 || it.start < 0 || it.end < 0}.any {it}
    } ?: false


}



fun getOpeningRules(openingString: String?): List<Rule> {
    if(openingString == null)
        return mutableListOf()

    var rules: MutableList<Rule> = mutableListOf()
    try {
        val parser =
            OpeningHoursParser(ByteArrayInputStream(openingString.toByteArray()))
        rules = parser.rules(false)
    } catch (pex: OpeningHoursParseException) {

    }
    return rules
}
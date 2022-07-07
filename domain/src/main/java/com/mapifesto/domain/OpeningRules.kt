package com.mapifesto.domain
import ch.poole.openinghoursparser.OpeningHoursParseException
import ch.poole.openinghoursparser.OpeningHoursParser
import ch.poole.openinghoursparser.Rule
import java.io.ByteArrayInputStream
import java.util.*

data class OpeningRule(
    val rule: Rule
) {
    val asString get(): String {
        return rule.toString()
    }
}

data class OpeningRules(
    val rules: List<OpeningRule>        //"Rule" cannot be known in views.
) {
    fun asString(): String {
        return rules.map{it.rule}.joinToString("; ")
    }

    fun addRules(openingRules: OpeningRules): OpeningRules {
        return OpeningRules(rules = rules + openingRules.rules)
    }

    fun deleteRule(rule: OpeningRule): OpeningRules {
        val localList = rules.toMutableList()
        localList.removeIf { it == rule }
        return OpeningRules(rules = localList)
    }

    val isOpenString get(): String {

        return if(rules.isEmpty()) "There are no rules for opening hours" else {
            val evaluation = rules.map{it.rule}.evaluate(Date())
            if(evaluation == null) this.asString() else {
                if(evaluation) "Open" else "Closed"
            }
        }

    }

    companion object {

        fun create(openingHours: String?): OpeningRules {
            return if (openingHours != null) OpeningRules(getOpeningRules(openingHours).map{ OpeningRule(it) }) else OpeningRules(listOf())
        }

        fun evaluateString(string: String): OpeningRules? {
            return try {
                val parser =
                    OpeningHoursParser(ByteArrayInputStream(string.toByteArray()))
                val rules = parser.rules(false)
                OpeningRules(rules = rules.map{OpeningRule(it)})

            } catch (pex: OpeningHoursParseException) {
                null
            }
        }

        fun mockup(): OpeningRules {
            return evaluateString("Mo-Fr 10.00-18.00")!!
        }
    }
}

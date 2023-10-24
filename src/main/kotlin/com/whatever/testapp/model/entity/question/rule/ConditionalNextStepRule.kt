package com.whatever.testapp.model.entity.question.rule


class ConditionalNextStepRule(
    val defaultNextStepId: String,
    val conditions: ArrayList<Condition>
) : NextStepRule(
    type = NextStepRuleType.CONDITIONAL,
) {
}

data class Condition(
    val variableName: String? = null,
    val ex: ConditionType,
    val values: ArrayList<String>? = null,
    val nextStepId: String? = null,
    val andClause: List<Condition>? = null,
    val orClause: List<Condition>? = null
)


enum class ConditionType {
    EQ, IN, AND, OR
}

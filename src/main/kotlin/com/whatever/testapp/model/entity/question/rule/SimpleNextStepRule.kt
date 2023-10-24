package com.whatever.testapp.model.entity.question.rule

class SimpleNextStepRule(
    val nextStepId: String? = null,
) : NextStepRule(
    type = NextStepRuleType.SIMPLE,
) {
}

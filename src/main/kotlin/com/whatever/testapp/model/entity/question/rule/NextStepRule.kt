package com.whatever.testapp.model.entity.question.rule

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@JsonSubTypes(
    JsonSubTypes.Type(value = ConditionalNextStepRule::class, name = "CONDITIONAL"),
    JsonSubTypes.Type(value = SimpleNextStepRule::class, name = "SIMPLE"),
)
abstract class NextStepRule(
    val type: NextStepRuleType,

    )

enum class NextStepRuleType {
    SIMPLE,
    CONDITIONAL
}

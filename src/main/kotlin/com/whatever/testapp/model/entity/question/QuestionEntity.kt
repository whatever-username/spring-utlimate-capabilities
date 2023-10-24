package com.whatever.testapp.model.entity.question

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.whatever.testapp.model.entity.question.rule.NextStepRule
import com.whatever.testapp.model.QuestionType

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@JsonSubTypes(
    JsonSubTypes.Type(value = TextQuestionEntity::class, name = "TEXT"),
    JsonSubTypes.Type(value = DateQuestionEntity::class, name = "DATE"),
    JsonSubTypes.Type(value = DocumentQuestionEntity::class, name = "DOCUMENT"),
    JsonSubTypes.Type(value = PollQuestionEntity::class, name = "POLL"),
    JsonSubTypes.Type(value = MultianswerPollQuestionEntity::class, name = "MULTIANSWER_POLL"),
)
abstract class QuestionEntity(
    open val id: String,
    val type: QuestionType,
    open val text: String,
    open val options: List<String>? = null,
    open val storeAnswerAs: String? = null,
    open val nextStepRule: NextStepRule,
)

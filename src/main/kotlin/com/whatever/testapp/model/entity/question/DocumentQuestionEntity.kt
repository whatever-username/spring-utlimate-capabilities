package com.whatever.testapp.model.entity.question

import com.whatever.testapp.model.entity.question.rule.NextStepRule
import com.whatever.testapp.model.QuestionType

data class DocumentQuestionEntity(
    override val id: String,
    override val text: String,
    override val nextStepRule: NextStepRule,
) : QuestionEntity(
    id,
    type = QuestionType.DOCUMENT,
    text = text,
    options = null,
    nextStepRule = nextStepRule
)

package com.whatever.testapp.model.entity.question

import com.whatever.testapp.model.QuestionType
import com.whatever.testapp.model.entity.question.rule.NextStepRule

data class TextQuestionEntity(
    override val id: String,
    override val text: String,
    override val nextStepRule: NextStepRule,
) : QuestionEntity(
    id,
    type = QuestionType.TEXT,
    text = text,
    options = null,
    nextStepRule = nextStepRule
)

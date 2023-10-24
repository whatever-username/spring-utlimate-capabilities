package com.whatever.testapp.model.entity.question

import com.whatever.testapp.model.QuestionType
import com.whatever.testapp.model.entity.question.rule.NextStepRule

data class DateQuestionEntity(
    override val id: String,
    override val text: String,
    override val nextStepRule: NextStepRule

) : QuestionEntity(
    id,
    type = QuestionType.DATE,
    text = text,
    options = null,
    nextStepRule = nextStepRule
)

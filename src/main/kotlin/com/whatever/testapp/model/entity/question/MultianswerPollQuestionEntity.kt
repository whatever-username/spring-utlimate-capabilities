package com.whatever.testapp.model.entity.question

import com.whatever.testapp.model.QuestionType
import com.whatever.testapp.model.entity.question.rule.NextStepRule

data class MultianswerPollQuestionEntity(
    override val id: String,
    override val text: String,
    override val options: List<String>,
    override val nextStepRule: NextStepRule,
) : QuestionEntity(
    id,
    type = QuestionType.POLL,
    text = text,
    options = null,
    nextStepRule = nextStepRule
)

package com.whatever.testapp.model.entity.question

import com.whatever.testapp.model.QuestionType
import com.whatever.testapp.model.entity.question.rule.NextStepRule

data class PollQuestionEntity(
    override val id: String,
    override val text: String,
    override val options: List<String>,
    override val nextStepRule: NextStepRule,
    override val storeAnswerAs: String? = null,
) : QuestionEntity(
    id,
    type = QuestionType.POLL,
    text = text,
    options = null,
    nextStepRule = nextStepRule,
    storeAnswerAs = storeAnswerAs
)

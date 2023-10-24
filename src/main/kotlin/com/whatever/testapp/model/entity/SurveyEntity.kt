package com.whatever.testapp.model.entity

import com.vladmihalcea.hibernate.type.json.JsonBinaryType
import com.whatever.testapp.model.entity.question.QuestionEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import org.hibernate.annotations.Type
import org.hibernate.annotations.TypeDef
import org.hibernate.annotations.TypeDefs

@TypeDefs(TypeDef(name = "jsonb", typeClass = JsonBinaryType::class))

@Entity(name = "survey")
data class SurveyEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val name: String,
    val description: String?,
    @Type(type = "jsonb")
    val questions: List<QuestionEntity>,
) {
}





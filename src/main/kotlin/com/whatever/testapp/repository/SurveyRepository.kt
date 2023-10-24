package com.whatever.testapp.repository

import com.whatever.testapp.model.entity.SurveyEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SurveyRepository : JpaRepository<SurveyEntity, Long> {
    fun findByName(name: String): SurveyEntity?
}

package com.whatever.testapp.service

import com.whatever.testapp.model.entity.SurveyEntity
import com.whatever.testapp.repository.SurveyRepository
import javax.annotation.PostConstruct
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class SurveyService(
    private val surveyRepository: SurveyRepository,
) {
    fun findById(id: Long): SurveyEntity? {
        return surveyRepository.findById(id).orElse(null)
    }

    fun findByName(name: String): SurveyEntity? {
        return surveyRepository.findByName(name)
    }

    @EventListener(ApplicationReadyEvent::class)
    fun qwe(){
        val byId = findById(1)
        val byName = findByName("FOR_NOVICES")
    }
}

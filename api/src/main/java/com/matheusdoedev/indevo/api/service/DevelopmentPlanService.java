package com.matheusdoedev.indevo.api.service;

import com.matheusdoedev.indevo.api.domain.development_plan.dto.CreateDevelopmentPlanDto;
import com.matheusdoedev.indevo.api.domain.development_plan.dto.CreateDevelopmentPlanResponseDto;

import jakarta.persistence.EntityNotFoundException;

public interface DevelopmentPlanService {

	public CreateDevelopmentPlanResponseDto createDevelopmentPlanDto(CreateDevelopmentPlanDto planDto)
			throws EntityNotFoundException;
}

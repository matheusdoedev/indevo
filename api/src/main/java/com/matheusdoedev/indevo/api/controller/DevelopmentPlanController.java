package com.matheusdoedev.indevo.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusdoedev.indevo.api.domain.development_plan.dto.CreateDevelopmentPlanDto;
import com.matheusdoedev.indevo.api.domain.development_plan.dto.CreateDevelopmentPlanResponseDto;
import com.matheusdoedev.indevo.api.service.impl.DevelopmentPlanServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/development-plan")
@Tag(name = "development-plan")
@AllArgsConstructor
public class DevelopmentPlanController {

	private final DevelopmentPlanServiceImpl developmentPlanService;

	@PostMapping("/create")
	public ResponseEntity<CreateDevelopmentPlanResponseDto> createDevelopmentPlan(
			@RequestBody @Valid CreateDevelopmentPlanDto createDevelopmentPlanDto) {
		CreateDevelopmentPlanResponseDto developmentPlanDto = this.developmentPlanService
				.createDevelopmentPlanDto(createDevelopmentPlanDto);

		return ResponseEntity.ok(developmentPlanDto);
	}
}

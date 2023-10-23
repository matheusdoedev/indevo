package com.matheusdoedev.indevo.api.domain.development_plan.dto;

import java.util.UUID;

import com.matheusdoedev.indevo.api.domain.development_plan.enums.PlanStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateDevelopmentPlanResponseDto {
	private String title;

	private String description;

	private String thumbImg;

	private UUID userId;

	private PlanStatus status;
}

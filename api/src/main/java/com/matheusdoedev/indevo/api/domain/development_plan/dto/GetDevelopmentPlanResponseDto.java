package com.matheusdoedev.indevo.api.domain.development_plan.dto;

import java.util.List;
import java.util.UUID;

import com.matheusdoedev.indevo.api.domain.development_plan.enums.PlanStatus;
import com.matheusdoedev.indevo.api.domain.goal.dto.GetGoalResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetDevelopmentPlanResponseDto {

	private String title;

	private String description;

	private String thumbImg;

	private UUID userId;

	private List<GetGoalResponseDto> goals;

	private PlanStatus status;
}

package com.matheusdoedev.indevo.api.domain.development_plan.dto;

import java.util.List;
import java.util.UUID;

import com.matheusdoedev.indevo.api.domain.goal.dto.CreateGoalDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateDevelopmentPlanDto {

	private String title;

	private String description;

	private String thumbImg;

	private UUID userId;

	private List<CreateGoalDto> goals;
}

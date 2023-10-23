package com.matheusdoedev.indevo.api.domain.goal.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetGoalResponseDto {
	private String title;

	private String description;

	private String thumbImg;

	private UUID developmentPlanId;

	private UUID userId;
}

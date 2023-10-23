package com.matheusdoedev.indevo.api.domain.goal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateGoalDto {

	private String title;

	private String description;

	private String thumbImg;
}

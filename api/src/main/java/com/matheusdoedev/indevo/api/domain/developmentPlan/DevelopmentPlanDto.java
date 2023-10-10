package com.matheusdoedev.indevo.api.domain.developmentPlan;

import java.util.List;
import java.util.UUID;

import com.matheusdoedev.indevo.api.domain.goal.Goal;
import com.matheusdoedev.indevo.api.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DevelopmentPlanDto {

	private UUID id;

	private String title;

	private String description;

	private String thumbImg;

	private PlanStatus status;

	private User user;

	private List<Goal> goal;
}

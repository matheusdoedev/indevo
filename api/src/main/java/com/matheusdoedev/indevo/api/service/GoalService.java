package com.matheusdoedev.indevo.api.service;

import com.matheusdoedev.indevo.api.domain.development_plan.DevelopmentPlan;
import com.matheusdoedev.indevo.api.domain.goal.dto.CreateGoalDto;
import com.matheusdoedev.indevo.api.domain.user.User;

public interface GoalService {

	public CreateGoalDto createGoalDto(CreateGoalDto goalDto, User user, DevelopmentPlan developmentPlan);
}

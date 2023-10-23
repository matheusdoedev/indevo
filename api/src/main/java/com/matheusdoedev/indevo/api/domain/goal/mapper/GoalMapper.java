package com.matheusdoedev.indevo.api.domain.goal.mapper;

import java.util.UUID;

import com.matheusdoedev.indevo.api.domain.development_plan.DevelopmentPlan;
import com.matheusdoedev.indevo.api.domain.goal.Goal;
import com.matheusdoedev.indevo.api.domain.goal.dto.CreateGoalDto;
import com.matheusdoedev.indevo.api.domain.goal.enums.GoalStatus;
import com.matheusdoedev.indevo.api.domain.user.User;

public class GoalMapper {

	private GoalMapper() {
	}

	public static Goal parseFromCreateDtoToEntity(CreateGoalDto goalDto, UUID goalId, GoalStatus goalStatus, User user,
			DevelopmentPlan developmentPlan) {
		return new Goal(
				goalId,
				goalDto.getTitle(),
				goalDto.getDescription(),
				goalDto.getThumbImg(),
				goalStatus,
				user,
				developmentPlan);
	}
}

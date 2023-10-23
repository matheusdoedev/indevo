package com.matheusdoedev.indevo.api.service.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.matheusdoedev.indevo.api.domain.development_plan.DevelopmentPlan;
import com.matheusdoedev.indevo.api.domain.goal.Goal;
import com.matheusdoedev.indevo.api.domain.goal.dto.CreateGoalDto;
import com.matheusdoedev.indevo.api.domain.goal.enums.GoalStatus;
import com.matheusdoedev.indevo.api.domain.goal.mapper.GoalMapper;
import com.matheusdoedev.indevo.api.domain.user.User;
import com.matheusdoedev.indevo.api.repository.GoalRepository;
import com.matheusdoedev.indevo.api.service.GoalService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GoalServiceImpl implements GoalService {

	private final GoalRepository goalRepository;

	public CreateGoalDto createGoalDto(CreateGoalDto goalDto, User user, DevelopmentPlan developmentPlan) {
		UUID newGoalId = UUID.randomUUID();
		Goal goal = GoalMapper.parseFromCreateDtoToEntity(
				goalDto,
				newGoalId,
				GoalStatus.PENDING,
				user,
				developmentPlan);

		this.goalRepository.save(goal);

		return goalDto;
	}
}

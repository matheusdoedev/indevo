package com.matheusdoedev.indevo.api.service.impl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.matheusdoedev.indevo.api.domain.development_plan.DevelopmentPlan;
import com.matheusdoedev.indevo.api.domain.development_plan.dto.CreateDevelopmentPlanDto;
import com.matheusdoedev.indevo.api.domain.development_plan.dto.CreateDevelopmentPlanResponseDto;
import com.matheusdoedev.indevo.api.domain.development_plan.enums.PlanStatus;
import com.matheusdoedev.indevo.api.domain.development_plan.mapper.DevelopmentPlanMapper;
import com.matheusdoedev.indevo.api.domain.goal.dto.CreateGoalDto;
import com.matheusdoedev.indevo.api.domain.user.User;
import com.matheusdoedev.indevo.api.repository.DevelopmentPlanRepository;
import com.matheusdoedev.indevo.api.repository.UserRepository;
import com.matheusdoedev.indevo.api.service.DevelopmentPlanService;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DevelopmentPlanServiceImpl implements DevelopmentPlanService {

	private final DevelopmentPlanRepository developmentPlanRepository;

	private final UserRepository userRepository;

	private final GoalServiceImpl goalServiceImpl;

	public CreateDevelopmentPlanResponseDto createDevelopmentPlanDto(CreateDevelopmentPlanDto planDto)
			throws EntityNotFoundException {
		UUID newPlanId = UUID.randomUUID();
		Optional<User> user = this.userRepository.findById(planDto.getUserId());

		if (user.isPresent()) {
			User userFound = user.get();
			DevelopmentPlan developmentPlan = DevelopmentPlanMapper.parseFromCreateDtoToEntity(planDto, newPlanId,
					userFound, PlanStatus.PENDING);

			for (CreateGoalDto goalDto : planDto.getGoals()) {
				goalServiceImpl.createGoalDto(goalDto, userFound, developmentPlan);
			}

			this.developmentPlanRepository.save(developmentPlan);

			return DevelopmentPlanMapper.parseFromEntityToCreateResponseDto(developmentPlan);
		} else {
			throw new EntityNotFoundException();
		}

	}
}

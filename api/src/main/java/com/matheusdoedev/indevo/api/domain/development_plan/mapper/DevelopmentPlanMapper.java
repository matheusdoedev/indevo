package com.matheusdoedev.indevo.api.domain.development_plan.mapper;

import java.util.List;
import java.util.UUID;

import com.matheusdoedev.indevo.api.domain.development_plan.DevelopmentPlan;
import com.matheusdoedev.indevo.api.domain.development_plan.dto.CreateDevelopmentPlanDto;
import com.matheusdoedev.indevo.api.domain.development_plan.dto.CreateDevelopmentPlanResponseDto;
import com.matheusdoedev.indevo.api.domain.development_plan.dto.GetDevelopmentPlanResponseDto;
import com.matheusdoedev.indevo.api.domain.development_plan.enums.PlanStatus;
import com.matheusdoedev.indevo.api.domain.goal.dto.GetGoalResponseDto;
import com.matheusdoedev.indevo.api.domain.user.User;

public class DevelopmentPlanMapper {

	private DevelopmentPlanMapper() {
	}

	public static DevelopmentPlan parseFromCreateDtoToEntity(CreateDevelopmentPlanDto createDevelopmentPlanDto,
			UUID developmentPlanId, User user, PlanStatus planStatus) {
		return new DevelopmentPlan(
				developmentPlanId,
				createDevelopmentPlanDto.getTitle(),
				createDevelopmentPlanDto.getDescription(),
				createDevelopmentPlanDto.getThumbImg(),
				planStatus,
				user);
	}

	public static GetDevelopmentPlanResponseDto parseFromEntityToGetResponseDto(DevelopmentPlan developmentPlan,
			List<GetGoalResponseDto> goals) {
		return new GetDevelopmentPlanResponseDto(
				developmentPlan.getTitle(),
				developmentPlan.getDescription(),
				developmentPlan.getThumbImg(),
				developmentPlan.getUser().getId(),
				goals,
				developmentPlan.getStatus());
	}

	public static CreateDevelopmentPlanResponseDto parseFromEntityToCreateResponseDto(DevelopmentPlan developmentPlan) {
		return new CreateDevelopmentPlanResponseDto(
				developmentPlan.getTitle(),
				developmentPlan.getDescription(),
				developmentPlan.getThumbImg(),
				developmentPlan.getUser().getId(),
				developmentPlan.getStatus());
	}
}

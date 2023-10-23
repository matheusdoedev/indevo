package com.matheusdoedev.indevo.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdoedev.indevo.api.domain.development_plan.DevelopmentPlan;

public interface DevelopmentPlanRepository extends JpaRepository<DevelopmentPlan, UUID> {
}

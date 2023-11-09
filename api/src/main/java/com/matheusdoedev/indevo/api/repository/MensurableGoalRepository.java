package com.matheusdoedev.indevo.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdoedev.indevo.api.domain.goal.MensurableGoal;

public interface MensurableGoalRepository extends JpaRepository<MensurableGoal, UUID> {
}

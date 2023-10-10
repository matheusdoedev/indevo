package com.matheusdoedev.indevo.api.domain.goal;

import java.util.UUID;

import com.matheusdoedev.indevo.api.domain.developmentPlan.DevelopmentPlan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "goals")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goal {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@Column(length = 50, nullable = false)
	private String title;

	@Column(length = 80, nullable = false)
	private String description;

	@Column(length = 80, nullable = true)
	private String thumbImg;

	@Column(nullable = false)
	private GoalStatus status;

	@ManyToOne
	private DevelopmentPlan developmentPlan;
}
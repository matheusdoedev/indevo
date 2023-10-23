package com.matheusdoedev.indevo.api.domain.development_plan;

import java.util.UUID;

import com.matheusdoedev.indevo.api.domain.development_plan.enums.PlanStatus;
import com.matheusdoedev.indevo.api.domain.user.User;

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
@Table(name = "development_plans")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DevelopmentPlan {
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
	private PlanStatus status;

	@ManyToOne
	private User user;
}

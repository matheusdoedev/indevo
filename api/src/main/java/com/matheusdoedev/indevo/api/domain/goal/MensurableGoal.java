package com.matheusdoedev.indevo.api.domain.goal;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mensurable_goals")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MensurableGoal {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@Column(nullable = false)
	private int targetValue;

	@Column(nullable = false)
	private int currentValue;

	@OneToOne
	private Goal goal;
}

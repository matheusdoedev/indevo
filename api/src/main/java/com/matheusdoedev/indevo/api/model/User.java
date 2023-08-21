package com.matheusdoedev.indevo.api.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@Column(name = "first_name", length = 200, nullable = false)
	private String firstName;

	@Column(name = "last_name", length = 200, nullable = false)
	private String lastName;

	@Column(name = "email", length = 200, nullable = false)
	private String email;

	@Column(name = "password", length = 200, nullable = false)
	private String password;
}

package com.matheusdoedev.indevo.api.domain.user.dto;

import java.util.UUID;

import com.matheusdoedev.indevo.api.domain.user.enums.UserRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	private UUID id;

	private String firstName;

	private String lastName;

	private String email;

	private String username;

	private String password;

	private UserRole role;

	private Boolean hasAcceptedUseTerms;
}

package com.matheusdoedev.indevo.api.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserDto {

	private String firstName;

	private String lastName;

	private String email;

	private String username;

	private String password;

	private Boolean hasAcceptedUseTerms;
}

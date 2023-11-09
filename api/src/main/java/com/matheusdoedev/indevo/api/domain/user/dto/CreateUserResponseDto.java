package com.matheusdoedev.indevo.api.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserResponseDto {

	private String firstName;

	private String lastName;

	private String email;

	private String username;
}

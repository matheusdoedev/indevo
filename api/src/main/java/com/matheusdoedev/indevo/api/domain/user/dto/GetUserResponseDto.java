package com.matheusdoedev.indevo.api.domain.user.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserResponseDto {

	private UUID userId;

	private String firstName;

	private String lastName;

	private String email;

	private String username;
}

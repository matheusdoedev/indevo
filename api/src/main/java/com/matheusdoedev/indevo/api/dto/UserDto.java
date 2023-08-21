package com.matheusdoedev.indevo.api.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {

	private UUID id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
}
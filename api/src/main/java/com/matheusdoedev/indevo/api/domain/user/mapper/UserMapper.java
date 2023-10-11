package com.matheusdoedev.indevo.api.domain.user.mapper;

import com.matheusdoedev.indevo.api.domain.user.User;
import com.matheusdoedev.indevo.api.domain.user.dto.CreateUserResponseDto;
import com.matheusdoedev.indevo.api.domain.user.dto.UserDto;

public class UserMapper {

	private UserMapper() {
	}

	public static User parseToEntity(UserDto userDto) {
		return new User(
				userDto.getId(),
				userDto.getFirstName(),
				userDto.getLastName(),
				userDto.getEmail(),
				userDto.getUsername(),
				userDto.getPassword(), userDto.getRole(), userDto.getHasAcceptedUseTerms());
	}

	public static CreateUserResponseDto parseToCreateUserResponseDto(UserDto userDto) {
		return new CreateUserResponseDto(
				userDto.getFirstName(), userDto.getLastName(), userDto.getEmail(), userDto.getUsername());
	}
}

package com.matheusdoedev.indevo.api.domain.user.mapper;

import java.util.UUID;

import com.matheusdoedev.indevo.api.domain.user.User;
import com.matheusdoedev.indevo.api.domain.user.dto.CreateUserResponseDto;
import com.matheusdoedev.indevo.api.domain.user.dto.GetUserResponseDto;
import com.matheusdoedev.indevo.api.domain.user.enums.UserRole;
import com.matheusdoedev.indevo.api.domain.user.dto.CreateUserDto;

public class UserMapper {

	private UserMapper() {
	}

	public static User parseFromCreateDtoToEntity(CreateUserDto userDto, UUID userId, UserRole userRole) {
		return new User(
				userId,
				userDto.getFirstName(),
				userDto.getLastName(),
				userDto.getEmail(),
				userDto.getUsername(),
				userDto.getPassword(),
				userRole,
				userDto.getHasAcceptedUseTerms());
	}

	public static CreateUserResponseDto parseToCreateUserResponseDto(CreateUserDto userDto) {
		return new CreateUserResponseDto(
				userDto.getFirstName(), userDto.getLastName(), userDto.getEmail(), userDto.getUsername());
	}

	public static GetUserResponseDto parseFromUserToGetUserResponseDto(User user) {
		return new GetUserResponseDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),
				user.getUsername());
	}
}

package com.matheusdoedev.indevo.api.user.mapper;

import java.util.ArrayList;
import java.util.List;

import com.matheusdoedev.indevo.api.user.dto.UserDto;
import com.matheusdoedev.indevo.api.user.model.User;

public class UserMapper {
	private UserMapper() {
	}

	public static UserDto parseToUserDto(User user) {
		return new UserDto(
				user.getId(),
				user.getFirstName(),
				user.getLastName(),
				user.getEmail(),
				user.getPassword(),
				user.getCreatedAt(),
				user.getUpdatedAt());
	}

	public static User parseToUserEntity(UserDto userDto) {
		return new User(
				userDto.getId(),
				userDto.getFirstName(),
				userDto.getLastName(),
				userDto.getEmail(),
				userDto.getPassword(),
				userDto.getCreatedAt(),
				userDto.getUpdatedAt());
	}

	public static List<UserDto> parseToUsersDtoList(List<User> users) {
		ArrayList<UserDto> usersDto = new ArrayList<>(users.size());

		for (int x = 0; x < users.size(); x++) {
			usersDto.add(x, parseToUserDto(users.get(x)));
		}

		return usersDto;
	}
}

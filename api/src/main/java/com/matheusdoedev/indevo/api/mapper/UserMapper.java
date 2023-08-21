package com.matheusdoedev.indevo.api.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.matheusdoedev.indevo.api.dto.UserDto;
import com.matheusdoedev.indevo.api.model.User;

public class UserMapper {

	public static UserDto parseToUserDto(User user) {
		return new UserDto(
				user.getId(),
				user.getFirstName(),
				user.getLastName(),
				user.getEmail(),
				user.getPassword());
	}

	public static User parseToUserEntity(UserDto userDto) {
		return new User(
				userDto.getId(),
				userDto.getFirstName(),
				userDto.getLastName(),
				userDto.getEmail(),
				userDto.getPassword());
	}

	public static List<UserDto> parseToUsersDtoList(List<User> users) {
		ArrayList<UserDto> usersDto = new ArrayList<>(users.size());

		for (int x = 0; x < users.size(); x++) {
			usersDto.add(x, parseToUserDto(users.get(x)));
		}

		return usersDto;
	}
}

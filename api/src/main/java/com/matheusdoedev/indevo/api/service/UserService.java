package com.matheusdoedev.indevo.api.service;

import java.util.List;
import java.util.UUID;

import com.matheusdoedev.indevo.api.dto.UserDto;

public interface UserService {
	public UserDto createUser(UserDto userDto);

	public List<UserDto> listUsers();

	public UserDto showUser(UUID userId);
}

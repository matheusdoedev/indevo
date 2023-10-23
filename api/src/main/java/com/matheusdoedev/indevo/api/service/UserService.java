package com.matheusdoedev.indevo.api.service;

import com.matheusdoedev.indevo.api.domain.user.dto.CreateUserResponseDto;
import com.matheusdoedev.indevo.api.domain.user.dto.CreateUserDto;

public interface UserService {

	public CreateUserResponseDto createUser(CreateUserDto userDto);
}

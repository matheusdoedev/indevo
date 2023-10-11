package com.matheusdoedev.indevo.api.service.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.matheusdoedev.indevo.api.domain.user.User;
import com.matheusdoedev.indevo.api.domain.user.enums.UserRole;
import com.matheusdoedev.indevo.api.domain.user.dto.CreateUserResponseDto;
import com.matheusdoedev.indevo.api.domain.user.dto.UserDto;
import com.matheusdoedev.indevo.api.domain.user.mapper.UserMapper;
import com.matheusdoedev.indevo.api.exception.UserWithThisResourceAlreadyExists;
import com.matheusdoedev.indevo.api.repository.UserRepository;
import com.matheusdoedev.indevo.api.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository repository;

	private final PasswordEncoderServiceImpl passwordEncoder;

	public CreateUserResponseDto createUser(UserDto userDto) {
		if (this.repository.findByUsername(userDto.getUsername()) != null) {
			throw new UserWithThisResourceAlreadyExists("userName");
		}

		String encryptedPassword = this.passwordEncoder.encode(userDto.getPassword());
		UUID newUserId = UUID.randomUUID();

		userDto.setPassword(encryptedPassword);
		userDto.setId(newUserId);
		userDto.setRole(UserRole.USER);

		User newUser = UserMapper.parseToEntity(userDto);

		this.repository.save(newUser);

		return UserMapper.parseToCreateUserResponseDto(userDto);
	}
}

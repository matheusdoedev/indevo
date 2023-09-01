package com.matheusdoedev.indevo.api.user.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.matheusdoedev.indevo.api.common.service.BCryptPasswordEncoderService;
import com.matheusdoedev.indevo.api.user.dto.UserDto;
import com.matheusdoedev.indevo.api.user.mapper.UserMapper;
import com.matheusdoedev.indevo.api.user.model.User;
import com.matheusdoedev.indevo.api.user.repository.UserRepository;
import com.matheusdoedev.indevo.api.user.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final BCryptPasswordEncoderService bCryptPasswordEncoderService;

	public UserDto createUser(UserDto userDto) {
		String encryptedPassword = bCryptPasswordEncoderService.getBcrypt().encode(userDto.getPassword());
		UUID userId = UUID.randomUUID();

		userDto.setId(userId);
		userDto.setPassword(encryptedPassword);

		User user = UserMapper.parseToUserEntity(userDto);

		this.userRepository.save(user);
		return userDto;
	}

	public List<UserDto> listUsers() {
		List<User> users = this.userRepository.findAll();

		return UserMapper.parseToUsersDtoList(users);
	}

	public UserDto showUser(UUID userId) {
		Optional<User> user = this.userRepository.findById(userId);

		return UserMapper.parseToUserDto(user.get());
	}
}

package com.matheusdoedev.indevo.api.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.matheusdoedev.indevo.api.dto.UserDto;
import com.matheusdoedev.indevo.api.mapper.UserMapper;
import com.matheusdoedev.indevo.api.model.User;
import com.matheusdoedev.indevo.api.repository.UserRepository;
import com.matheusdoedev.indevo.api.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	public UserDto createUser(UserDto userDto) {
		userDto.setId(UUID.randomUUID());

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

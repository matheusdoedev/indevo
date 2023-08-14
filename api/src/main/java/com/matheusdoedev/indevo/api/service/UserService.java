package com.matheusdoedev.indevo.api.service;

import org.springframework.stereotype.Service;

import com.matheusdoedev.indevo.api.model.User;
import com.matheusdoedev.indevo.api.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public User createUser(User user) {
		return this.userRepository.save(user);
	}
}

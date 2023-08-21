package com.matheusdoedev.indevo.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusdoedev.indevo.api.dto.UserDto;
import com.matheusdoedev.indevo.api.model.User;
import com.matheusdoedev.indevo.api.service.impl.UserServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class AuthController {

	private final UserServiceImpl userService;

	@PostMapping("/signup")
	public UserDto postSignUp(@RequestBody UserDto user) {
		this.userService.createUser(user);

		return user;
	}
}

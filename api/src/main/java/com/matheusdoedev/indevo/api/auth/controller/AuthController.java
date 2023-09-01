package com.matheusdoedev.indevo.api.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusdoedev.indevo.api.user.dto.UserDto;
import com.matheusdoedev.indevo.api.user.service.impl.UserServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class AuthController {

	private final UserServiceImpl userService;

	@PostMapping("/signup")
	public ResponseEntity<UserDto> postSignUp(@RequestBody UserDto userDto) {
		UserDto createdUserDto = this.userService.createUser(userDto);

		return ResponseEntity.ok(createdUserDto);
	}
}

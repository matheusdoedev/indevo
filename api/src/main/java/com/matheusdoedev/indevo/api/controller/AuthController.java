package com.matheusdoedev.indevo.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusdoedev.indevo.api.domain.auth.AuthenticationDto;
import com.matheusdoedev.indevo.api.domain.user.dto.CreateUserResponseDto;
import com.matheusdoedev.indevo.api.domain.user.dto.UserDto;
import com.matheusdoedev.indevo.api.service.impl.UserServiceImpl;

import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@AllArgsConstructor
@Tag(name = "authentication")
public class AuthController {

	private final AuthenticationManager authenticationManager;

	private final UserServiceImpl userService;

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody @Valid AuthenticationDto authenticationDto) {
		UsernamePasswordAuthenticationToken usernamePassword = new UsernamePasswordAuthenticationToken(
				authenticationDto.getUsername(),
				authenticationDto.getPassword());

		this.authenticationManager.authenticate(usernamePassword);

		return ResponseEntity.ok().build();
	}

	@PostMapping("/register")
	public ResponseEntity<CreateUserResponseDto> register(@RequestBody @Valid UserDto userDto) {
		CreateUserResponseDto createdUser = this.userService.createUser(userDto);

		return ResponseEntity.ok(createdUser);
	}

}
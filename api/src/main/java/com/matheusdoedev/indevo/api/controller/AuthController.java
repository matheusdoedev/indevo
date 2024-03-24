package com.matheusdoedev.indevo.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusdoedev.indevo.api.domain.auth.AuthenticationDto;
import com.matheusdoedev.indevo.api.domain.auth.LoginResponseDto;
import com.matheusdoedev.indevo.api.domain.user.User;
import com.matheusdoedev.indevo.api.domain.user.dto.CreateUserDto;
import com.matheusdoedev.indevo.api.domain.user.dto.CreateUserResponseDto;
import com.matheusdoedev.indevo.api.service.TokenService;
import com.matheusdoedev.indevo.api.service.impl.UserServiceImpl;

import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@AllArgsConstructor
@Tag(name = "authentication")
@CrossOrigin
public class AuthController {

	private final AuthenticationManager authenticationManager;

	private final UserServiceImpl userService;

	private final TokenService tokenService;

	@PostMapping("/login")
	public ResponseEntity<LoginResponseDto> login(@RequestBody @Valid AuthenticationDto authenticationDto) {
		UsernamePasswordAuthenticationToken usernamePassword = new UsernamePasswordAuthenticationToken(
				authenticationDto.getUsername(),
				authenticationDto.getPassword());

		var auth = this.authenticationManager.authenticate(usernamePassword);

		String token = tokenService.generateToken((User) auth.getPrincipal());

		return ResponseEntity.ok(new LoginResponseDto(token));
	}

	@PostMapping("/register")
	public ResponseEntity<CreateUserResponseDto> register(@RequestBody @Valid CreateUserDto userDto) {
		CreateUserResponseDto createdUser = this.userService.createUser(userDto);

		return ResponseEntity.ok(createdUser);
	}

}

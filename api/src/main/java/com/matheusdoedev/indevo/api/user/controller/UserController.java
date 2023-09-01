package com.matheusdoedev.indevo.api.user.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusdoedev.indevo.api.user.dto.UserDto;
import com.matheusdoedev.indevo.api.user.service.impl.UserServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

	private final UserServiceImpl userService;

	@GetMapping
	public List<UserDto> getListUsers() {
		return this.userService.listUsers();
	}

	@GetMapping("{userId}")
	public ResponseEntity<UserDto> getShowUser(@PathVariable("userId") UUID userId) {
		UserDto userDto = this.userService.showUser(userId);

		return ResponseEntity.ok(userDto);
	}
}

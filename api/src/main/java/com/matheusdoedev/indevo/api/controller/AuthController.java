package com.matheusdoedev.indevo.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusdoedev.indevo.api.domain.auth.AuthenticationDto;

import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@AllArgsConstructor
@Tag(name = "authentication")
public class AuthController {

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody @Valid AuthenticationDto authenticationDto) {
		return ResponseEntity.ok("Ok");
	}

}

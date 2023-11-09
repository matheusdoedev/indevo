package com.matheusdoedev.indevo.api.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/health-check")
@Tag(name = "health-check")
public class HealthCheckController {

	@GetMapping
	public ResponseEntity<String> getHealthCheck() {
		String dateAsString = new Date().toString();

		return ResponseEntity.ok(dateAsString);
	}

}

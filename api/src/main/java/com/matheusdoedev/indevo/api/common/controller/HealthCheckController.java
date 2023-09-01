package com.matheusdoedev.indevo.api.common.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/health-check")
public class HealthCheckController {

	@GetMapping
	public ResponseEntity<String> getHealthCheck() {
		String dateAsString = new Date().toString();

		return ResponseEntity.ok(dateAsString);
	}

}

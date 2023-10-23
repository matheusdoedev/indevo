package com.matheusdoedev.indevo.api.service;

import org.springframework.stereotype.Service;

import com.auth0.jwt.algorithms.Algorithm;
import com.matheusdoedev.indevo.api.domain.user.User;

@Service
public class TokenService {
	private String secret;

	public String generateToken(User user) {
		try {
			Algorithm algorithm = Algorithm.HMAC256(secret);
		} catch (Exception e) {
			throw e;
		}
	}
}

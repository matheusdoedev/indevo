package com.matheusdoedev.indevo.api.service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.matheusdoedev.indevo.api.domain.user.User;

@Service
public class TokenService {
	private static final String ISSUER_KEY = "indevo-api";

	@Value("${api.security.token.secret}")
	private String secret;

	public String generateToken(User user) {
		try {
			Algorithm algorithm = Algorithm.HMAC256(secret);

			return JWT.create()
					.withIssuer(ISSUER_KEY)
					.withSubject(user.getUsername())
					.withExpiresAt(this.getExpirationDate())
					.sign(algorithm);
		} catch (JWTCreationException exception) {
			throw new JWTCreationException(secret, exception);
		}
	}

	public String validateToken(String token) {
		try {
			Algorithm algorithm = Algorithm.HMAC256(secret);

			return JWT.require(algorithm)
					.withIssuer(ISSUER_KEY)
					.build()
					.verify(token)
					.getSubject();
		} catch (JWTVerificationException exception) {
			throw new JWTVerificationException(token);
		}
	}

	private Instant getExpirationDate() {
		return LocalDateTime.now().plusDays(2).toInstant(ZoneOffset.of("-03:00"));
	}
}

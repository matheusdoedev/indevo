package com.matheusdoedev.indevo.api.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BCryptPasswordEncoderService {
	private BCryptPasswordEncoder bcrypt;

	public BCryptPasswordEncoderService() {
		this.bcrypt = new BCryptPasswordEncoder();
	}

	public BCryptPasswordEncoder getBcrypt() {
		return this.bcrypt;
	}
}

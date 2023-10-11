package com.matheusdoedev.indevo.api.service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.matheusdoedev.indevo.api.service.PasswordEncoderService;

@Service
public class PasswordEncoderServiceImpl implements PasswordEncoderService {
	private BCryptPasswordEncoder bcrypt;

	public PasswordEncoderServiceImpl() {
		this.bcrypt = new BCryptPasswordEncoder();
	}

	public String encode(String password) {
		return this.bcrypt.encode(password);
	}
}

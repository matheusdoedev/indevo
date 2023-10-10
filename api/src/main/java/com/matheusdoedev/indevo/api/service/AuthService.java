package com.matheusdoedev.indevo.api.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface AuthService extends UserDetailsService {

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}

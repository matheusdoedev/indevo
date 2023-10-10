package com.matheusdoedev.indevo.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.matheusdoedev.indevo.api.domain.user.User;

public interface UserRepository extends JpaRepository<User, UUID> {

	UserDetails findByUsername(String username);
}

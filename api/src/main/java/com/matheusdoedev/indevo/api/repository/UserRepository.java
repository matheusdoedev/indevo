package com.matheusdoedev.indevo.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdoedev.indevo.api.domain.user.User;

public interface UserRepository extends JpaRepository<User, UUID> {

	User findByUsername(String username);
}

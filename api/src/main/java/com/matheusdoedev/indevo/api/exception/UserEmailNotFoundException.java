package com.matheusdoedev.indevo.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserEmailNotFoundException extends RuntimeException {

	public UserEmailNotFoundException() {
		super("User with this email was not found.");
	}
}

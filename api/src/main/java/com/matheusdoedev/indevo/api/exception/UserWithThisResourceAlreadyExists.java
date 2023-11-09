package com.matheusdoedev.indevo.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UserWithThisResourceAlreadyExists extends RuntimeException {

	private final String fieldName;

	public UserWithThisResourceAlreadyExists(String fieldName) {
		super("User with this " + fieldName + " already exists");

		this.fieldName = fieldName;
	}
}
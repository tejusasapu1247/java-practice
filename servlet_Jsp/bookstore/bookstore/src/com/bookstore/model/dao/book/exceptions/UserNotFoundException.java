package com.bookstore.model.dao.book.exceptions;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(String message) {
		super(message);
	}
}

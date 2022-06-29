package com.customer;

public class CustomerNotFoundException extends RuntimeException{
	public CustomerNotFoundException(String message) {
		super(message);
	}
}

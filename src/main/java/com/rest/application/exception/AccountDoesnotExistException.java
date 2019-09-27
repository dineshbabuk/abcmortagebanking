package com.rest.application.exception;

public class AccountDoesnotExistException extends RuntimeException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountDoesnotExistException(String accountNumber) {
		
		super("Account number : "+ accountNumber +" doesnot exist ");
	
	}
}

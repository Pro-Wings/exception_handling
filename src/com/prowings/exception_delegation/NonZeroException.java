package com.prowings.exception_delegation;

public class NonZeroException extends Exception{
	
	private String message;

	public NonZeroException() {
		super();
	}

	public NonZeroException(String message) {
		super(message);
	}
	
	

}

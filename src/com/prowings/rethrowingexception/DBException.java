package com.prowings.rethrowingexception;

public class DBException extends RuntimeException{

	public DBException() {
		super();
	}

	public DBException(String message) {
		super(message);
	}

	public DBException(Throwable cause) {
		super(cause);
	}

	
	
}

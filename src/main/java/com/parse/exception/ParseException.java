package com.parse.exception;

public class ParseException extends Exception {
	private static final long serialVersionUID = 7340648404849103544L;

	public ParseException() {
	}

	public ParseException(String error) {
		super(error);
	}

	public ParseException(Throwable cause) {
		super(cause);
	}

	public ParseException(String error, Throwable cause) {
		super(error, cause);
	}

}

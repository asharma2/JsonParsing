package com.parse.exception;

public class ParseRuntimeException extends RuntimeException {
	private static final long serialVersionUID = 6645960886899608549L;

	public ParseRuntimeException() {
	}

	public ParseRuntimeException(String error) {
		super(error);
	}

	public ParseRuntimeException(Throwable cause) {
		super(cause);
	}

	public ParseRuntimeException(String error, Throwable cause) {
		super(error, cause);
	}

}

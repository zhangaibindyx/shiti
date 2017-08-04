package com.zab.question.exception;

public class TypeNotExistException extends Exception {
	private int error = 9003;

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "type is not find " + "error:" + error;
	}

	public TypeNotExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public TypeNotExistException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public TypeNotExistException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TypeNotExistException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}

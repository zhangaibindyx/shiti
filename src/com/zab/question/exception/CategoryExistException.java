package com.zab.question.exception;

/**
 * �����Ѵ����쳣
 * 
 * @author zhangaibin
 *
 */
public class CategoryExistException extends Exception {
	/*** �����Ѵ��� */
	private int error = 9001;

	public CategoryExistException(int error) {
		super();
		this.error = error;
	}

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	public CategoryExistException() {
		super();
	}

	@Override
	public String getMessage() {
		return "cartegory exist ,please try again" + "error:" + error;
	}

	public CategoryExistException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public CategoryExistException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CategoryExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CategoryExistException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}

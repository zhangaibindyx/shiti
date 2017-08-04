package com.zab.question.exception;
/**
 * ���Ͳ������쳣 �����޸Ļ�ɾ�� ����ʱ���쳣
 * @author zhangaibin
 *
 */
public class CategoryNotExistException extends Exception {
	/***�����Ѵ���*/
	private int error=9001;
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "category not find ,try again"+",error:"+error;
	}
	public CategoryNotExistException(int error) {
		super();
		this.error = error;
	}

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	public CategoryNotExistException() {
		super();
	}

	public CategoryNotExistException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public CategoryNotExistException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CategoryNotExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CategoryNotExistException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}

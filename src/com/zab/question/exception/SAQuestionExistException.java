package com.zab.question.exception;
/**
 * 当题库中已存在此题时抛出此异常
 * @author zhangaibin
 *
 */
public class SAQuestionExistException extends Exception {
	private int error = 8001;

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "SAQuestion is existes " + "error:" + error;
	}

	public SAQuestionExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public SAQuestionExistException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public SAQuestionExistException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public SAQuestionExistException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}

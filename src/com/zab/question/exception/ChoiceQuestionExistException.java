package com.zab.question.exception;
/**
 * 当题库中已存在此题时抛出此异常
 * @author zhangaibin
 *
 */
public class ChoiceQuestionExistException extends Exception {
	private int error = 7001;

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "ChoiceQuestion is exites " + "error:" + error;
	}

	public ChoiceQuestionExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ChoiceQuestionExistException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ChoiceQuestionExistException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ChoiceQuestionExistException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}

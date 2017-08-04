package com.zab.question.exception;

/**
 * 当题库中找不到此此题时抛出此异常
 * 
 * @author zhangaibin
 *
 */
public class ChoiceQuestionNotExistException extends Exception {
	private int error = 7003;

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "SAQuestion  is not find " + "error:" + error;
	}

	public ChoiceQuestionNotExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ChoiceQuestionNotExistException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ChoiceQuestionNotExistException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ChoiceQuestionNotExistException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}

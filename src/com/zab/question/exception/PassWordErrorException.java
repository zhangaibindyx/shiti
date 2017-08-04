package com.zab.question.exception;
/***
 *  ’À∫≈“—¥Ê‘⁄“Ï≥£
 * @author zhangaibin
 *
 */
public class PassWordErrorException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "PassWord is error£¨try name again"+2003;
	}

	public PassWordErrorException() {
		// TODO Auto-generated constructor stub
	}

	public PassWordErrorException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public PassWordErrorException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public PassWordErrorException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public PassWordErrorException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}

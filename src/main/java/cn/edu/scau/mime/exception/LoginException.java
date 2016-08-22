package cn.edu.scau.mime.exception;
/**
 * @author jet
 * @description TODO
 * @date 2016年8月18日
 * @version v1.0
 */
public class LoginException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5561205864075093184L;

	/**
	 * 
	 */
	public LoginException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public LoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public LoginException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public LoginException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public LoginException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}

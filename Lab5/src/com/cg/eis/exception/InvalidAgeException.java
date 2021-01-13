package com.cg.eis.exception;

public class InvalidAgeException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException()
	{
		super();
	}
	
	public InvalidAgeException(String errMsg)
	{
		super(errMsg);
	}

}

package com.cg.eis.exception;

public class InvalidNameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidNameException ()
	{
		super();
	}
	
	public InvalidNameException(String errMsg)
	{
		super(errMsg);
	}

}

package com.cg.eis.exception;

public class InvalidSalaryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidSalaryException()
	{
		super();
	}
	
	public InvalidSalaryException(String errMsg)
	{
		super(errMsg);
	}

}

package com.cg.bank.exception;

public class InvalidAccountNumberException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidAccountNumberException()
	{
		super();
	}

	public InvalidAccountNumberException(String errMsg)
	{
		super(errMsg);
	}

}

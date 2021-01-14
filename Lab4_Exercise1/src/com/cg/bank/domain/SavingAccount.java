package com.cg.bank.domain;

/**
 * This SavingAccount will be used as data traveller object
 * @author Rupsi
 *
 */

public class SavingAccount extends Account {

	
	private double balance;
	public SavingAccount(final Long accNo,final String accHolderName, final double balance)
	{
		super(accNo,accHolderName);
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	
	
}

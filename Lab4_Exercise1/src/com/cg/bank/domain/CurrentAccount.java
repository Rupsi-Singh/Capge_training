package com.cg.bank.domain;

public class CurrentAccount extends Account{
	
	private double overDraftLimit;
	public CurrentAccount(final Long accNo, final String accHolderName, final double overDraftLimit)
	{
		super(accNo,accHolderName);
		this.overDraftLimit=overDraftLimit;
		
	}
  public double getOverDraftLimit()
  {
	  return overDraftLimit;
  }
}

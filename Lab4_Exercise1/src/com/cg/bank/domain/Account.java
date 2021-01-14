package com.cg.bank.domain;

public abstract class Account {
	
	private Long accNo;
	private String accHolderName;
	public Account(Long accNo, String accHolderName)
	{
		super();
		this.accNo=accNo;
		this.accHolderName=accHolderName;

	}
	
	public Long getAccNo() {
		return accNo;
	}
	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	

}

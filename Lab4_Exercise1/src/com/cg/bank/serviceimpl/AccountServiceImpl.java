package com.cg.bank.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.cg.bank.domain.Account;
import com.cg.bank.domain.CurrentAccount;
import com.cg.bank.domain.SavingAccount;
import com.cg.bank.exception.InsufficientBalanceException;
import com.cg.bank.exception.InvalidAccountNumberException;
import com.cg.bank.service.AccountService;

public class AccountServiceImpl implements AccountService {
	
	private List<Account> accountRepository;
	
	public AccountServiceImpl() {
		accountRepository=new ArrayList<>();
	}

	@Override
	public void createAccount(int accType, String accountHolder) {
		Account newAccount=null;
		Long newAccountNumber =  System.currentTimeMillis();
		double openingBalance;
		if(accType==AccountService.ACCOUNT_TYPE_SAVING_ACCOUNT) {
			openingBalance=500;
			newAccount =  new SavingAccount(newAccountNumber, accountHolder, openingBalance);
		}
		else if(accType==AccountService.ACCOUNT_TYPE_CURRENT_ACCOUNT) {
			openingBalance = 5000;
			newAccount =  new CurrentAccount(newAccountNumber, accountHolder, openingBalance);
		}
		
		accountRepository.add(newAccount);
	}

	@Override
	public void depositeMoney(Long accNo, int accType, double amount) throws InvalidAccountNumberException {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdrawMoney(Long accNo, int accType, double amount)
			throws InvalidAccountNumberException, InsufficientBalanceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Account displayAccountStatus(Long accNo, int accType) throws InvalidAccountNumberException {
		// TODO Auto-generated method stub
		return null;
		

	}

	@Override
	public List<Account> showAllAccounts() {		
		return accountRepository;
	}

}
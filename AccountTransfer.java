package com.mybank;

import java.util.Date;

public class AccountTransfer extends Transaction implements AccountTransferServices {

	
	
	
	
	
	
	
	public AccountTransfer(long transactionId) {
		super(transactionId);
		
		this.setTransactionId(transactionId);
		
		
	}

	
	
	
	@Override
	public void transfer(Account accountFrom, Account accountTo, double ammount) {
		
		boolean temp=accountFrom.withdrawn(ammount);
		
		if(temp) {
			accountTo.deposite(ammount);
			this.setDate(new Date());
			this.setType("Transfer");
			this.setAmmount(ammount);
			
			accountFrom.getTransactionList().add(this);
			accountTo.getTransactionList().add(this);
			System.out.println("TK "+this.getAmmount()+" Is Credited from "+accountFrom.getTitle()+" to "+ accountTo.getTitle());
			
			
		}
		else {
			
			System.out.println("Transfer unsuccessfull");
		
			}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}

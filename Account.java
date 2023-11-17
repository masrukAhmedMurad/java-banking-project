package com.mybank;

import java.util.ArrayList;
import java.util.Scanner;

public class Account implements AccountServices {
	
	Scanner sc=new Scanner(System.in);
	
	private long accountNo;
	private String title;
	private double balance;
	
	
	
	private ArrayList<Transaction>transactionList=new ArrayList<Transaction>();

	
	
	
//	public Account(Customer customer) {
//		
//	
//		
//	System.out.println("\nEnter Account No : ");
//	this.accountNo=sc.nextLong();
//	
//	System.out.println("\nEnter Account Title : ");
//	this.title=sc.next();
//	
//	System.out.println("\nEnter Initial Deposite Ammount : ");
//	this.balance=sc.nextDouble();
//	
//	customer.getAccountList().add(this);
//	
//	System.out.println("Account Has been created Successfully.");
//	
//		
//	}
	
	
	

	public Account(Customer customer, long accountNo, String title, double balance) {
		super();
		this.accountNo = accountNo;
		this.title = title;
		this.balance = balance;
		
		customer.getAccountList().add(this);
		
		System.out.println("\nAccount Created successfully belongs to customer : "+customer.getName()+"\n");
		
	}

	
	
	

	public long getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public ArrayList<Transaction> getTransactionList() {
		return transactionList;
	}


	public void setTransactionList(ArrayList<Transaction> transactionList) {
		this.transactionList = transactionList;
	}


	
	
	
	
	
	//overriding from account services interface


	@Override
	public void deposite(double ammount) {
		
		this.setBalance(this.getBalance()+ammount);
		System.out.println("\nTK : "+ammount+" has been deposited successfully "+this.getTitle()+"\n");
		
	}




	@Override
	public boolean withdrawn(double ammount) {
		
		if(this.getBalance()-500>=ammount) {
			this.setBalance(this.balance-ammount);
			System.out.println("\nTK : "+ammount+" has been withdrawn successfully from "+this.getTitle()+"\n");
			return true;
			
		}else {
			
			System.out.println("Insufficient fund");
			return false;
		}
		
		
	}
	
	
	
	
	
	
	

	void displayAccountInfo() {
		
		
		System.out.println("\n==================================================\n");
		System.out.println("Account ID : "+this.getAccountNo());
		System.out.println("Account Title : "+this.getTitle());
		System.out.println("Account Balance : "+this.getBalance());
		System.out.println("\n==================================================\n");

			
			System.out.println("==================================================");
			System.out.println("\nTransactions\n");
			System.out.println("==================================================");
			
			
			if(this.getTransactionList().isEmpty()){
				
				System.out.println("No Transaction has belongs to "+this.getTitle());
				
			}else {
				
				for(Transaction tx : this.getTransactionList()) {
					tx.displayTransactionInfo();
				}
				
			}
			
			
		}
	
	
	
	
	
	
	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	

package com.mybank;

import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Scanner; 

public class Transaction implements TransactionServices {

	
	Scanner sc=new Scanner(System.in);
	
	
	private long transactionId;
	private Date date;
	private String type;
	private double ammount;
	
	
	
	
	public Transaction() {
		
//		System.out.println("\nEnter transaction id : ");
//		this.transactionId=sc.nextLong();
//		
//		System.out.println("\nEnter Ammount to transact : ");
//		this.ammount=sc.nextDouble();
		
	}

	
	


	public Transaction(long transactionId) {


		this.transactionId = transactionId;
		
		
	}
	
	
	
	
	
	
	


	public long getTransactionId() {
		return transactionId;
	}



	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public double getAmmount() {
		return ammount;
	}



	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}



	
	
	
	
	
	
	
	@Override
	public void deposite(Account account, double ammount) {
	
		account.deposite(ammount);
		this.setDate(new Date());
		this.setType("Deposite");
		this.setAmmount(ammount);
		
		account.getTransactionList().add(this);
		
	}


	
	
	

	@Override
	public void withdrawn(Account account, double ammount) {
		
	boolean temp=account.withdrawn(ammount);
	
		if(temp) {
			
			this.setDate(new Date());
			this.setType("Withdrawn");
			this.setAmmount(ammount);
			account.getTransactionList().add(this);
			
		}else {
			
		System.out.println("\nTransaction unsuccessfull\n");
	
		}
		
	}

	
	
	
	
	

	
	
	
	
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
  
    
	


	void displayTransactionInfo() {
		
		
		System.out.println("\n==================================================\n");
		System.out.println("Transaction ID : "+this.getTransactionId());
		System.out.println("Transaction Time & Date : "+formatter.format(this.getDate()));
		System.out.println("Transaction Type : "+this.getType());
		System.out.println("Transaction Ammount : "+this.getAmmount());
		System.out.println("\n==================================================\n");
	}





	
	
	
	
	
	
	
	
	
	
}

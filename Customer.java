package com.mybank;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

	
	Scanner sc=new Scanner(System.in);
	
	
	private long customerId;
	private String name;
	private String phone;
	private String email;
	private ArrayList<Account> accountList=new ArrayList<Account>();
	
	
	//default constructor
	
	public Customer() {
		
		System.out.println("\nEnter Customer ID : ");
		this.customerId=sc.nextLong();
		
		System.out.println("\nEnter Customer Name : ");
		this.name=sc.nextLine();
		
		System.out.println("\nEnter Customer Phone : ");
		this.phone=sc.nextLine();
		
		System.out.println("\nEnter Customer Email : ");
		this.email=sc.nextLine();
		
		System.out.println("\nCustomer Registered successfully\n");
		
	}

	
	
	//paraeterized constructor

	public Customer(long customerId, String name, String phone,String email) {
		
		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		
		System.out.println("\nCustomer Registered successfully\n");
	}


	
	//getter setter
	
	

	public long getCustomerId() {
		return customerId;
	}



	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public ArrayList<Account> getAccountList() {
		return accountList;
	}



	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}
	
	
	
	
	
	
	
	
	
	
	//display info;

	
	void displayCustInfo() {
		
		
		System.out.println("\n==================================================\n");
		System.out.println("Customer ID : "+this.getCustomerId());
		System.out.println("Customer Name : "+this.getName());
		System.out.println("Customer Phone : "+this.getPhone());
		System.out.println("Customer Email : "+this.getEmail());
		System.out.println("\n==================================================\n");
		
		
		System.out.println("\n==================================================\n");
		System.out.println("\nAccounts\n");
		System.out.println("\n==================================================\n");
		
		
		
		if(this.getAccountList().isEmpty()){
			
			System.out.println("No account has belongs to "+this.getName());
			
		}else {
			
			for(Account acc : this.getAccountList()) {
				System.out.println("Account Title : "+acc.getTitle()+" Balance : "+acc.getBalance());
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

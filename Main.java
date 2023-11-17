package com.mybank;

public class Main {

	public static void main(String[] args) {


		System.out.println("Welcome to My Bank\n\n");
		
		
		//creating a customer object
		Customer c1=new Customer(1,"Rakib","01799999999","rakib@gmail.com");
		
		Customer c2=new Customer(1,"raihan","01733333333","raihan@gmail.com");
		
		//display the customer info
		
		c1.displayCustInfo();
		
		c2.displayCustInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		Account ac1=new Account(c1,001,"Md rakib hasan",1000.00);
		
		
		ac1.displayAccountInfo();
		
		
		Transaction t1=new Transaction(001);
		
		t1.deposite(ac1, 4000);
		
		
		Transaction t2=new Transaction(002);
		
		t2.withdrawn(ac1, 2000);
		
		
		Account ac2=new Account(c1,001,"shapla auto ltd.",5000.00);
		
		AccountTransfer at1=new AccountTransfer(003);
		at1.transfer(ac1, ac2, 200);
		
		
		ac1.displayAccountInfo();
		
		ac2.displayAccountInfo();
		
		c1.displayCustInfo();
		
		
		
		
		

	}

}

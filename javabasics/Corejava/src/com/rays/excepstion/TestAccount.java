package com.rays.excepstion;

public class TestAccount {

	
	 public static void main(String[] args) throws CloneNotSupportedException {
		// this is deep cloning ;
		Customer c = new Customer ("yash");		 
		 
		Customer c1 =  (Customer)c.clone();
		 

		    c1.name = "ravi ";
		    c1.account.balance = 200;
		    
		     System.out.println(c.name);
		     System.out.println(c.account.balance);
		     System.out.println(c1.name);
		     
		     System.out.println(c1.account.balance);
		     
		     
		     
		     
		 // this is shello cloning  
		 
	//	 Account a = new Account ();
	//	 Account a1 = (Account)a.clone();
		// a1.balance= 200;
		 
		// System.out.println(a.balance);
		//  System.out.println(a1.balance);
	}
}

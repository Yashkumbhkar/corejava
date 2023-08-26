package com.rays.excepstion;

public class Customer implements Cloneable{
  
	 String name = null ;
	 
	 Account account = new Account (100);
	 
	 
	   public Customer ( String name  ) { 
		    this.name = name;
		    this.account = account;
		    
	   } 
	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	    Customer c  = (Customer)super.clone();
	     c.account = (Account)account.clone();
	    	return c;
	    }
}

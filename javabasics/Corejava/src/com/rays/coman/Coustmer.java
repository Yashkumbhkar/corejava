package com.rays.coman;

public class Coustmer implements Cloneable {
 
	  String name = null;
	  Account account = null;
	  
	  
	 public Coustmer(String name ) {
		this.name= name;
		this.account= new Account(10);
		
	} 
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		 Coustmer c = (Coustmer) super.clone();
		 c.account = (Account) account.clone();
			return c;
	}
}

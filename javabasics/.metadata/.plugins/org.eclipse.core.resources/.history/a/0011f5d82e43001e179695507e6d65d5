package com.rays.cloning;

public class Customer1 implements Cloneable {
	String name= null;
	Account account = null;
	public Customer1(String name) {
		this.name= name;
		this.account= new Account(100);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer1 c = (Customer1)super.clone();
		c.account=(Account)account.clone();
		return c;
	}

}

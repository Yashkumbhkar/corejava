package com.rays.cloning;

public class Account1 implements Cloneable{
	//Object o= 100;
	int balance =0;
	public Account1() {
		
	}
	public Account1(int balance) {
		this.balance= balance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

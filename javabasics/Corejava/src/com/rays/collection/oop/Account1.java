package com.rays.oop;

public class Account1 {
   private int  balance =0;

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}
   
   public  void Deposite (int amt) {
	   int total = getBalance()+amt;
	   setBalance(total);
	   System.out.println("balance after deposite ="+getBalance());
   }
   
	public void withDraw(int amt) {
		int total= getBalance()-amt;
		setBalance(total);
		System.out.println(getBalance());
	}
			   
			   
	   
}


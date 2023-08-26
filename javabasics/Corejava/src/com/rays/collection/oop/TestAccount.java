package com.rays.oop;

public class TestAccount {
 public static void main(String[] args) {
	    Account a = new Account();
	    a.setNumber("23241");
	    a.setType("sawing");
	    a.setBalance(232.6);
	    
	    System.out.println(a.getNumber());
	    System.out.println(a.getType());
	    System.out.println(a.getBalance());
}
}

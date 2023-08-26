package com.rays.coman;

public class TestCoust {
 public static void main(String[] args) throws CloneNotSupportedException {
	
	 Coustmer c1 = new Coustmer("yash");
	 Coustmer c2 = (Coustmer)c1.clone();
	 c2.name = "aaryan";
	 c2.account.balance= (200);
	  System.out.println(c2.name);
	  System.out.println(c1.name);
	  System.out.println(c2.account.balance);
	  System.out.println(c1.account.balance);
}
}

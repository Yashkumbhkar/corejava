package com.rays.excepstion;

public class TestException {
	
	 public static void main(String[] args) {
		
		 
		 int a =10;
		 int b = 3;
		 String name = "yash";
		 System.out.println("hey");
		 
		 
		 try {
			 
			 int c = a/b;
			 System.out.println("Division="+c);
			 System.out.println(name.length());
			 System.out.println(name.charAt(6));
			
		}
		 catch (ArithmeticException e) {
System.out.println(e);
		}
		 catch (Exception e) {
			 
	System.out.println(e);
		
		 
	}
		 System.out.println("by");
}
}


package com.rays.collection1;

public class TestEmployee {
	 public static void main(String[] args) {
		
		  Employee e1 = new Employee(1, "yash", "indore");
		  Employee e2 = new Employee (2, "yash ","indore");
		  
		  System.out.println(e1.equals(e2));
		  System.out.println(e1.hashCode());
		  
	}

}

package com.rays.thread;

public class TestWithOutThread {
 
	 public static void main(String[] args) {
		
		 WithOutThread t1 = new WithOutThread("ravi");
		 
		  WithOutThread t2 = new WithOutThread("yash");
		  
		  
		  t1.run();
		  t2.run();
	}
}

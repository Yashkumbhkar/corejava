package com.rays.thread;

public class TestWithThread {

	 public static void main(String[] args) {
		
		  WithThread t1 = new WithThread("yash");
		  
		   WithThread t2 = new WithThread("ravi");
		   
		   t1.setPriority(1);
		   t2.setPriority(10);
		   
		    t1.start();
		    t2.start();
		    }
}

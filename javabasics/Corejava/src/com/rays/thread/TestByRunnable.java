package com.rays.thread;

public class TestByRunnable {

	 public static void main(String[] args) {
		
		 Thread t1 = new Thread(new ByRunnable("yash"));
		 
		 Thread t2 = new Thread(new ByRunnable("ravi"));
		 
		 t1.start();
		 t2.start();
		 
	}
}

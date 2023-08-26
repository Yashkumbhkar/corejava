package com.rays.thread;

public class WithOutThread {
 
	 String name = null;
	 
	 public WithOutThread(String name ) {
		 
		 this.name= name ;
		 
			}
	 public void run(){
		 
		 for (int i = 1; i < 5; i++) {
			
			 System.out.println(i+" "+name);
			 
		}
	 }
	
	 
}

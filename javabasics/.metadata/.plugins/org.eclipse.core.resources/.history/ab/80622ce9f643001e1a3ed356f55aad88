package com.rays.thread;

public class TestDaemonThread {

	 public static void main(String[] args) {
		
		 BackgroundThread t1 = new BackgroundThread("daemon thread");
		 
		 t1.setDaemon(true);
		 t1.start();
		 
		 for (int i = 1; i < 10; i++) {
			
			 try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			 System.out.println(i+" "+"main");
		}
	}
}

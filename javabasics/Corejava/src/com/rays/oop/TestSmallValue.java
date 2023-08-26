package com.rays.oop;

public class TestSmallValue {
 public  void small( ) {
	int[]arr= {32,54,23,65,21};
		int a;
		int size=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i]<arr[j]) {
				a =	arr[i];
				arr[i]=arr[j];
				arr[j]=a;
				}
			}
			
		}
		System.out.println(arr[size]);
	}
 

//public class TestPractice {

public static  void main(String[] args) {
	 practice p = new practice();
	 
	// practice.Test(45, 10);
  TestFact.Fact(2);
 
  TestSmallValue.small();
	  
  }
}







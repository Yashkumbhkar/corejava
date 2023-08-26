package com.rays.oop;

public class Divisibleby7 {
public static void test() {
	int count =0;
	int b = 0;
	int i;
int	n=7;
	for( i=100;i<200;i++) {
		
		if(i%n==0) {
			count=i;
			System.out.println(count);
			b = b+count;
		}
		
	}
	System.out.println("sum="+b);
}
public static void main(String[] args) {
	Divisibleby7 d =  new Divisibleby7 ();
	
	Divisibleby7 .test();
}
}
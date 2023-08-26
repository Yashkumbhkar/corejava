package in.co.rays;

public class Fibonacci1 {
 
	 public static void main(String[] args) {
		
		 int a=0;
		 int b= 1;
		 int c;
		  System.out.println(a+"\n" +b);
		  for (int i = 0; i < 10; i++) {
			  
			   c= a+b;
			   a=b;
			   b=c;
			   
			System.out.println(c);   
			
		}
		  
		  
	}
}

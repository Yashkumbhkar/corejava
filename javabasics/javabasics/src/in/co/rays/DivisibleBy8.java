package in.co.rays;

public class DivisibleBy8 {
  public static void main(String[] args) {
	
	  int a = 8;
	  int count = 0;
	  int b=0;
	  
	  for (int i = 10; i < 50; i++) {
		  
		  if (i%2==0) {
			  
			count =i;
			System.out.println(count);
			b=  b+count;
		  }
			  
		
	}
	  System.out.println("sum = "+b);
}
}

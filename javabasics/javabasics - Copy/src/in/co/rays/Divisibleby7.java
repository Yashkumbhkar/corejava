package in.co.rays;

public class Divisibleby7 {
	
	
	public static void main(String[] args) {
		
		int a=7;
		int count=0;
		int b=0;
		
		
		for (int i = 100; i < 200; i++) {
			
			
			if (i%a==0) {
				
				count=i;
				System.out.println(count);
			b=b+count;
				
			}
			
			
			
		}
		
		System.out.println("sum ="+b);
		
	}
	

}

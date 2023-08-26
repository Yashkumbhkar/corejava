package in.co.Rayss;

public class Plaindrom {
	
	
	public static void main(String[] args) {
		
		
		int a=156;
		
		int b=a;
		int c=0;
		int d;
		
		
		while(b>0) {
			
			d=b%10;
			
			c=c*10+d;
			//c=c+(d*d*d);
			
			b=b/10;
			
			
		}
		if (a==c) {
			
			System.out.println("yes"+b);
					}else {
						
						
						System.out.println("no "+b);
					}
		System.out.println(c);
		
		
	}
	
	
	

}

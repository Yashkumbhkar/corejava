package in.co.rays;

public class Testprogram {
 
	public static void main(String[] args) {
		
		int a =1634;
		int b=a;
		int c= 0;
		int d;
		
		
		 while(b>0) {
			 
			 
			  d = b%10;
		    c= c+(d*d*d);
		      b = b/10;
		 }
		      if(a==c)
		      {
		    	  System.out.println("yes");
		      }else {
		    	  System.out.println("no");
		      }
	}
}
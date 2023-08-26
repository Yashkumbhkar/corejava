package in.co.rays;

public class Reverse {

	public static void main(String[] args) {
		
		int n= 23243;
	
		int b=0;
		int count;
		
		while( n!=0)

		{
		count=n%10;
		
		
		b=b*10+count;
		n=n/10;
		
		}
		System.out.println(b);
	}
}

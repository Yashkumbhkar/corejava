package in.co.rays;

public class TestFabonaci {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int sum =0;
	{
		System.out.println(a+"\n"+b);
		for(int i=0;i<5;i++)
		{
			
			a=b;
			b=sum;
			sum =a+b;
		
			System.out.println(sum);
		}
		}
	}
	
}

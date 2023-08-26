package in.co.Rayss;

public class Correct1 {
public static void main(String[] args) {
	
	int n=3437678;
	int r;
	for (int i =0;i<=n;i++)
	{
		r=n%10;
		System.out.print(r);
		n=n/10;
	}
}
}

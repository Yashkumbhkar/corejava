package in.co.Rayss;

public class Palindrom1 {
public static void main(String[] args) {
	
	int a=145674;
	int b=a;
	int c=0;
	int d;
	
	while (b>0) {
		 
		d = b%10;
		c = c*10+d;
		b = b/10;
}
	if (a==c)
	{
		//System.out.println("this is palindrom");
	}else {
		//System.out.println("this is not palindrom");
	}
	System.out.println(c);
}
}


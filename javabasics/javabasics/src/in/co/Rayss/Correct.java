package in.co.Rayss;

public class Correct {
public static void main(String[] args) {
	int i;
	int c=0;
	int d;
	int a = 45467;
	int b =a;
	for(i=0;i<a;i++) {
		d=b%10;
		c = c*10+d;
		b= b/10;
		System.out.print(d);
	}
	
		
}
}

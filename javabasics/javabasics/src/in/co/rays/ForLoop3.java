package in.co.rays;

public class ForLoop3 {
public static void main(String[] args) {
	
	int i;
	int j;
	for(i=0;i<5;i++)
	{
		for(j=0;j<i;j++)
			System.out.print(" * ");
	}
	System.out.print(i);
}
}

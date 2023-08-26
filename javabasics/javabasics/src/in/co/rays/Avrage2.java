package in.co.rays;

public class Avrage2 {
  public static void main(String[] args) {
	
	  int a = 10;
	  int sum=0;
	  int avg;
	  int count =0;
	  
	   for (int i=1;i<=10;i++)
	   {
		   if(i%2==0) {
			  
			   sum =  sum+i;
			   count++;
		   }
	   }
		  
	   avg =  sum/count;
	   System.out.println(avg);
	   
}
}

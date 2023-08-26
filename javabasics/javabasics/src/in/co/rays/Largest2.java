package in.co.rays;

public class Largest2 {
 public static void main(String[] args) {
	
	 int[] arr = {23,87,56,78,45};
	 
	 int a =0;
	 
	  for (int i = 0; i < arr.length; i++) {
		  if (arr[i]>a)
			  a=arr[i];
		
	}
	  System.out.println(a);
}
}

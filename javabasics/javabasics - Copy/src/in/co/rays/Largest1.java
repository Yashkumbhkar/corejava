package in.co.rays;

public class Largest1 {
 public static void main(String[] args) {
	
	 int [] arr = {23,50,20,45,7};
	 int a=0;
	 int b=0;
//	 int c=0;
	 for (int i = 0; i < arr.length; i++) {
		 if (arr[i]>b) {
			 b=a;
			 a=b;
			 b = arr[i];
			// c=arr[i];
		 }
		 
		 if (arr[i]<b && arr[i]>a) {// && arr[i]<c) {
			 
			 
			 a=arr[i];
			
		}
		 
		 
	}
	System.out.println(a);
}
}

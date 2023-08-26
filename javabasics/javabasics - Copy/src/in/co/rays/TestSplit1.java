package in.co.rays;

public class TestSplit1 {
 public static void main(String[] args) {
	
	 String name  = " yash kumbhkar ";
	String [] arr = name.split(" ");
	 
	 for (int i = 0; i < arr.length; i++) {
		 for (int j =  arr[i].length()-1; j >=0;j--) {
			 System.out.println(arr[i].charAt(j)+" ");
			
		}
		
	}
	 
}
}

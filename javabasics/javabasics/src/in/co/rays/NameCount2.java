package in.co.rays;

public class NameCount2 {
 public static void main(String[] args) {
	
	 
	 String[] name = {"yash","ayush","hariom","sachin","vikash"};
	 int count = 0;
	 for (int i = 0; i < name.length; i++) {
		 for (int j = 0; j < name[i].length(); j++) {
			 
			 
				 if(name[i].charAt(j)=='r') {
					 count++;
			 }
			
		}
		
	}
		 System.out.println(count);
	 }
 }

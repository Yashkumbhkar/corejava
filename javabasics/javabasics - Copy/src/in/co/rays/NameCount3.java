package in.co.rays;

public class NameCount3 {
 public static void main(String[] args) {
	
	 String[] name = {"yash","hari","ayush","lucky","sachin"};
	 int count =0;
	 for (int i = 0; i < name.length; i++) {
		 for (int j = 0; j < name[i].length(); j++) {
			 if(name[i].charAt(j)=='u')
			 {
				 count++;
			 }
		 }
			
		}
		System.out.println(count);
	}
}


package in.co.Rayss;

public class TestNote {
 
	 public static void main(String[] args) {
		int a = 1232;
		int []note= {2000,500,200,100,50,20,10};
		int count=0;
		for (int i = 0; i < note.length; i++) {
			
			count = a/note[i];
			if(count>0) {
			System.out.println(note[i]+"="+count);
			
		}
			
			a =   a%note[i];
	}
		
	 }
}

package com.rays.withconstructor;


public class TestConstructor {

	public static void main(String[] args) {
		
		
		  
		 
		Shap [] s  = new Shap[3];
		
		
		
		s[0] =  new Rectangle (10,20);
	
     	s[1] =  new Circle (10);
		
		
		s[2] = new Tringle (10,20);
		
		  
	
	 double totalArea = 0  ; 
	
	    
	    for (int j = 0;j < s.length; j++) {
			
	
		totalArea = totalArea + s[j].area();
	    	  
			
		}
	    System.out.println("Total Area ="+totalArea);
	     
	    
	}
}

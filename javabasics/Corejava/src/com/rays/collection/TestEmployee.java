package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;


public class TestEmployee {
	
	public static void main(String[] args) {
		
	
	 Employee e1 = new Employee (1, "yash", "indore ");
	 
	
	 
	 Employee e2 = new Employee (2, "Ravi", "indore ");
	 
	 
	 
	 
	 
	 ArrayList list = new ArrayList ();
	 
   list.add(e1);
   list.add(e2);
   
  // chack forloop 
  //  for (int i = 0; i < list.size(); i++) {
    	
    //	 Employee e =(Employee) list.get(i);	
    	 
    //	 System.out.println(e);
//	}
  // chack for Each
    	 
    //	 for(Object object : list) {
    	//	 Employee e =(Employee) object;
    		 //System.out.println(e);
    	// }
   // test itrator 
   
    
   Iterator it = list.iterator();
   while (it.hasNext()){
	   
	   Employee e = (Employee)it.next();
	   System.out.println(e);
	   it.remove();
   }
   
  
   System.out.println(list);
   
    
   
   
	}
	

	
}

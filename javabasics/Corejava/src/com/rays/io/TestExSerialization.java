package com.rays.io;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestExSerialization {
 public static void main(String[] args) throws Exception {
	
	  FileOutputStream file = new FileOutputStream("C:\\Users\\rkumb\\OneDrive\\Desktop\\IO\\Extobj.txt");
	  ObjectOutputStream out = new ObjectOutputStream(file);
	  
	  Employee e = new Employee();
	  
	  e.id=1;
	  e.name = "yash";
	  e.adress ="indore";
	  e.salary = 500000;
	  
	   out.writeObject(e);
	    out.close();
	    file.close();
	    
	    System.out.println("succefully");
	    
	    
}
}

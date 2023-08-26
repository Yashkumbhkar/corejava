package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
  
	 public static void main(String[] args) throws Exception {
		
		 FileOutputStream  file = new FileOutputStream("C:\\Users\\rkumb\\OneDrive\\Desktop\\IO\\obj.txt");
		 ObjectOutputStream out = new ObjectOutputStream(file);
		 
		  Marksheet m = new Marksheet();

		  m.id=10;
		  m.name = "yash";
		  m.physics = 89;
		  m.chamistry= 99;
		  m.maths = 100;
		  m.total=m.chamistry+m.physics+m.maths;
		  
		  out.writeObject(m);
		  
		  out.close();
		  file.close();
		  
		  System.out.println("succesfull");
		  System.out.println("total="+m.total);
		  
		  
		  
		 
	}
}

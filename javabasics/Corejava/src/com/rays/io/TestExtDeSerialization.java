package com.rays.io;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class TestExtDeSerialization {

	
public static void main(String[] args) throws Exception {
	
 FileInputStream file = new FileInputStream("C:\\Users\\rkumb\\OneDrive\\Desktop\\IO\\Extobj.txt");
 
	 
	 ObjectInputStream in  = new ObjectInputStream(file);
	 
	 Employee e =  (Employee) in.readObject();
	 
	 System.out.println("id="+e.id );
	 System.out.println("name="+e.name );
	 System.out.println("adress="+e.adress );
	 System.out.println("salary="+e.salary);

	 
	 in.close();
	 file.close();
	 

}
}

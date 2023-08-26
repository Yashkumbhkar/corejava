package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadWriteByBinary {

	
	 public static void main(String[] args) throws Exception {
		
		 FileInputStream in = new FileInputStream("C:\\Users\\rkumb\\OneDrive\\Desktop\\image\\wall.jpg");
		 FileOutputStream out = new FileOutputStream("C:\\Users\\rkumb\\OneDrive\\Desktop\\IO\\hello.jpg");
		 
		 int ch = in.read();
		 while(ch!=-1) {
			 out.write(ch);
			// System.out.print((char)ch);
			 ch = in.read();
			 
		 }
		 in.close();
		 System.out.println("data copeid");
	}
}

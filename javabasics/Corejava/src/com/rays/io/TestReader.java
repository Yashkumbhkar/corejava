package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
 public static void main(String[] args) throws IOException {
	 
	FileReader reader = new FileReader("C:\\Users\\rkumb\\OneDrive\\Desktop\\IO\\hello.txt");
	
	 int ch = reader.read();
	 while(ch!=-1) {
		 System.out.println((char)ch);
		 ch= reader.read();
	 }
	
	reader.close();
}

}


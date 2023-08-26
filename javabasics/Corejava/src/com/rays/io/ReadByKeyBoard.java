package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadByKeyBoard {

	 public static void main(String[] args) throws IOException {
		
		 InputStreamReader isReader = new InputStreamReader(System.in);
		 BufferedReader in = new BufferedReader(isReader);
		 
 PrintWriter  out= new PrintWriter("C:\\\\Users\\\\rkumb\\\\OneDrive\\\\Desktop\\\\IO\\\\keyboard.txt");
	
	 String line = in.readLine();
	 while(!(line.equals("bye"))) {
		 out.println(line);
		 line= in.readLine();
		 
	 }
	 out.close();
	 in.close();
	 isReader.close();
	 }
}

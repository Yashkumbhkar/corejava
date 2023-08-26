package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class TestReadAndWrite {

	 public static void main(String[] args) throws Exception {
		
		 
		 BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\rkumb\\OneDrive\\Desktop\\IO\\gmail.txt"));
		PrintWriter out1 = new PrintWriter(new FileWriter("C:\\Users\\rkumb\\OneDrive\\Desktop\\IO\\correct.txt"));
		
		PrintWriter out2 = new PrintWriter(new PrintWriter("C:\\Users\\rkumb\\OneDrive\\Desktop\\IO\\incorrect.txt"));
		
		String line = in.readLine();
		while(line!=null) {
			if(line.endsWith("@gmail.com")) {
				out1.print(line);
			}else {
				out2.println(line);
			}
			line = in.readLine();
		}
		out2.close();
		out1.close();
		in.close();
		
		
		System.out.println("data copied successfully");
	}
}

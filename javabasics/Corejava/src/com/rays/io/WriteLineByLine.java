package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteLineByLine {
public static void main(String[] args) throws IOException {
	
	FileWriter file = new FileWriter("C:\\Users\\rkumb\\OneDrive\\Desktop\\IO\\hello.txt");
	
	PrintWriter out = new PrintWriter(file);
	
	out.println("hello yash");
	out.println("how are u");
	
	out.close();
	file.close();
	System.out.println("data write successfully");
}
}

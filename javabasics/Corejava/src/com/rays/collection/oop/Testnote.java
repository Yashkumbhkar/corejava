package com.rays.oop;

public class Testnote {
	public  static void NoteCount(int number) {
	int[]note = {2000,500,200,100,50,20,10,2,1};
	int count =0;
	for (int i = 0; i < note.length; i++) {
		
		count = number /note[i];
		if (count>0) {
			System.out.println(note[i]+"="+count);
			
		}
		number = number%note[i];
		
	}
}
}
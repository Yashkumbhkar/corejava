package com.rays.calling;

public class TestShap {
  public static void main(String[] args) {
	
	  
    Shape s = new Shape ("red",10);
	  
	  Rectangle r = new Rectangle(10,20);
	  
	  
	  System.out.println(r.getBorderWidth());
	  System.out.println(r.getColor());
	//  System.out.println(s.toString());
	  System.out.println(s.getClass());
	    
}
}

package com.rays.withconstructor;

public class Rectangle extends Shap {
	
	private int  length;
	private int  width;
	
	
	

	
	public Rectangle ( int length  , int width) {
		this.length = length ;
		this.width= width;
		
		
	}
	 public void  setLength (int length ) {
		 
		  this.length = length ;
		  
		 
	 }
	 public int getLength(){
		 return length ;
		 
		 
	 }
	 
	  public void setWidth (int width ) {
		  this.width = width;
		  
	  }
	  public int getWidth() {
		  return width;
	  }
	  public  double  area() {
			 int rArea = getLength()*getWidth();
			 System.out.println("Rectangle Area ="+rArea);
			 
			 return rArea ;
	}
	
}
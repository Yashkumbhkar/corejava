package com.rays.calling;

public class Shape {
   
	   private  String color = null;
	 private int borderWidth =0;
	 
	  public Shape () {
		  
		   System.out.println("Shape defualt");
	  }
	  
	  
	  public Shape(String color , int borderWidth) {
		  this.borderWidth = borderWidth;
		 this.color = color;
	}


	public void Shape (String color , int borderWidth ) {
	  
		  this.color = color ;
		  this.borderWidth = borderWidth;
		  
	  }


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getBorderWidth() {
		return borderWidth;
	}


	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public double area() {
		
		System.out.println("Shape area method ");
		return 0;
		
	}
}

 package com.rays.withconstructor;

public class Shap { 
	
	private String color=null;
	private  int borderwidth=0;

	
	
	public Shap() {
		
	}
	
	public Shap( String  color,int borderWidth) {
		
		
		this.borderwidth=  borderWidth;
		this.color = color;
		
		
		
	}
	
	
	public String getColor() {
		return color;
		 
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidht() {
		return borderwidth;
	}
	public void setBorderwidht(int borderwidht) {
		this.borderwidth = borderwidht;
	}
	 
	   public  double  area () {
		   
		   System.out.println("Shap area method ....!!!!");
		   return area() ;
		   
		   
		   
	   }

}

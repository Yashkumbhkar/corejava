package com.rays.inharitance;

public class Shap {

	    private String color = null;
	    private int borderWidth=0;
	    
	    
	    
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
	    	System.out.println("Shap area method...!!");
	    	return 0;
	    }
	    
}

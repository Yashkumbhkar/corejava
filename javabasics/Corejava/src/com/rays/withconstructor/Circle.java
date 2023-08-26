package com.rays.withconstructor;

public class Circle  extends Shap{
   
	
	
	private   int redius= 0;
	public static double PI =3.15; 
	
	
	public Circle( int redius) {
		this.redius= redius ;
		
	}
	public void setRedius(int redius) {
		this.redius = redius ;
		
		
	}
	public int getRedius() {
		
		return redius;
	}
    public double area () {
   	double cArea =PI*getRedius()* getRedius();
   	 System.out.println("Circle Area ="+cArea);
   			
   	 return cArea ; 
	
}}
    

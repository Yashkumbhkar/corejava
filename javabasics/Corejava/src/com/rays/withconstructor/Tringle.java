package com.rays.withconstructor;

public class Tringle extends Shap{
	
	 private int base=0;
	 private int heigth =0;
	 
	 public Tringle (int base , int heigth ) {
		 
		 this.base = base;
		 this.heigth = heigth ;
		 
	 }
	 public void setBase (int base ) {
		 this.base = base;
		 
	 }
	 public int  getBase() {
		 
		 return base;
	 }
	 public void setheigth ( int heigth ) {
		 this.heigth= heigth ;
		 
	 }
	 
	 public int getHeigth () {
		 
		 return heigth;
	 }

	 
		public double area () {
			int tArea = (getBase()*getHeigth())/2;
			System.out.println("Triangle Area ="+tArea);
			return tArea;
		}
	 
	 
	 
}

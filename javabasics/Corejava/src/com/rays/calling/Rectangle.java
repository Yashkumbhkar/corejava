package com.rays.calling;

public class Rectangle extends Shape{

	   private  int length;
	   private int Width  ;
	   


public Rectangle () {
	
}
public Rectangle (int length,int Width) {
	super("green",100);
	this.length = length;
	this.Width = Width;
}

public Rectangle (int length,int Widt,String color , int borderWidth) {
	super(color,borderWidth);
	this.length = length;
	this.Width = Width;
	
}



public int getLength() {
	return length;
}



public void setLength(int length) {
	this.length = length;
}



public int getWidth() {
	return Width;
}



public void setWidth(int width) {
	Width = width;
}

public double area() {
	int rArea= getLength()*getWidth();
	
	System.out.println("Rectangle Area ="+rArea);
	return rArea;
}
}

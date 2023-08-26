package com.rays.collection1;

public class Employee {
 
	 private int id =0;
	 private String name = null;
	   private String adress = null;
	
	   
	   
	    public Employee (int id , String name , String adress) {
	    	this.id = id ;
	    	this.name= name ;
	    	this.adress= adress;
	    	
	    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		
		
		return id+" "+name+" "+ adress;
	}
	@Override
	public boolean equals(Object obj) {
		 if(!(obj instanceof Employee)){
			 return false;
			 
		 }

	
	Employee e= (Employee)obj ;
	boolean b =   this.id==e.id && this.name==e.name && this.adress==e.adress;
	return b;
	
	
	
}
	@Override
	public int hashCode() {
	String str = id+name+adress;
	return str.hashCode();
		
	}
}
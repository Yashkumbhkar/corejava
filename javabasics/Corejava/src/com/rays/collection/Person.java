package com.rays.collection;

public class Person {
 private int id = 0;
 private String name =null;
 private String adress = null;
 
 public Person (int id , String name , String adress ) {
	 
	 this.id=id ;
	 this.name= name;
	 this.adress = adress;
	 
	 
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
}
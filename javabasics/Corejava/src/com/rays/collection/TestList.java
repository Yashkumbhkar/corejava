package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
 public static void main(String[] args) {
	
	 List l1 = new ArrayList();
	 
	 l1.add("abc");
	 l1.add("cde");
l1.add("abc");
	 l1.add( "bcd");
	  System.out.println(l1);
	  
	  List l2 = new ArrayList();
	  
	  
	  l2.add("cdb");
	  
	   l1.addAll(l2);
	    l2.add("efg");
	   System.out.println(l1.get(1));
	   System.out.println( l1.remove(3)); 
	   
	   System.out.println(l1.indexOf(3)); 
	   System.out.println(l1.lastIndexOf(3));
	 
	   
 }
 
}

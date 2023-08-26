package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
 
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add("one");
		c1.add(2);
		c1.add(true);
		
		System.out.println(c1);
		
		 Collection c2 = new ArrayList();
		 
		 c2.add('a');
		 c2.add('b');
		 c2.add('c');
		 
		  System.out.println(c2);
		  
		  c1.addAll(c2);
		  System.out.println(c1);
		  
		  System.out.println(c1.contains('c'));
		  System.out.println(c1.containsAll(c2));
		  System.out.println(c1.isEmpty());
		  c1.remove('a');
		  System.out.println(c1);
		  
	}
}

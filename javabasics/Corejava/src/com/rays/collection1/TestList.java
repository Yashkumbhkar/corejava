package com.rays.collection1;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class TestList {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add(1);
	list.add("one");
	
	Iterator it = list.iterator();
	
	//list.add(2);
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}

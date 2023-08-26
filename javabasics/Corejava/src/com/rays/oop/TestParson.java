package com.rays.oop;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestParson {
  public static void main(String[] args) throws Exception {
	Date d = new Date (0);
	System.out.println(d);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	java.util.Date d1 = sdf.parse("05/05/2003");

	  Person p = new Person ();
	 p.setName("yash");
	 p.setAddres("754 mig vikash nagar dewas");
	 
	 System.out.println(p.getName());
	
	System.out.println(p.getDob());
	 System.out.println(p.getAddres());
	 System.out.println(sdf.format(d1));
	 
	  
	  
	  
	  
	  
}
}

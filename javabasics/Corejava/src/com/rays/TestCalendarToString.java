package com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendarToString {
public static void main(String[] args) throws ParseException {
	
	String givendate = " 01/01/2024";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar call = Calendar.getInstance();
	call.setTime(sdf.parse(givendate));
	call.add(Calendar. DATE , 30);
	Date d = call.getTime();
	
	System.out.println(sdf.format(d));
	
}
}

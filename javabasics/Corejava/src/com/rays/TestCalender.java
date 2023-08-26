package com.rays;

import java.util.Calendar;
import java.util.Date;

public class TestCalender {

public static void main(String[] args) {
	
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE, 10);
	Date d = cal.getTime();
	System.out.println(d);
	
}
}

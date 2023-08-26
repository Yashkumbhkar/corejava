package com.rays.shivanshi;

import java.util.Calendar;
import java.util.Date;

public class Testcalendar {
public static void main(String[] args) {
	
	Calendar cal= Calendar.getInstance();
	cal.add(Calendar.DATE, 13);
	Date d= new Date();
	System.out.println(d);
}
}

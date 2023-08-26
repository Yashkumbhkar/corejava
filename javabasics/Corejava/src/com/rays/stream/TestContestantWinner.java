package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestantWinner {
  public static void main(String[] args) {
	
	  ArrayList<ContestantWinner> list = new ArrayList<ContestantWinner>();
	  
	  list.add(new ContestantWinner("yash","12345678910"));
	  list.add( new ContestantWinner("ram","1223344545"));
	  list.add(new ContestantWinner("vikash","2121234334"));
	  list.add(new ContestantWinner("Viram","3423567543"));
	  list.add(new ContestantWinner("kunal","3322211143"));
	  list.add(new ContestantWinner("ravi","1111122222"));
	  list.add(new ContestantWinner("sandeep","0231212322"));
	  list.add(new ContestantWinner("deepu","9999955555"));
	  list.add(new ContestantWinner("hari","7879204545"));
	  list.add(new ContestantWinner("ayush","5423764534"));
	  
	  
	   list.stream().map(e -> e.phone).filter(e -> e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),
			   e ->{
	   
	   Collections.shuffle(e);
	   return e.stream();})).limit(10).forEach(e -> {
		   System.out.println(e);
		   
	   
	   });
	   
	  
}
}

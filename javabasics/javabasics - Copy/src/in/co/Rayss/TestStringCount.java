package in.co.Rayss;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestStringCount {
 public static void main(String[] args) {
	 String input = "he23llo 123 jav6a";
	  Pattern pattern = Pattern.compile("\\d+");
	  Matcher matcher = pattern.matcher(input);
	  while (matcher.find()) {
		  
		  System.out.println(matcher.group());
	  }
	  
	  
}
}

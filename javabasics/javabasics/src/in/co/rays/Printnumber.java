package in.co.rays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Printnumber {
public static void main(String[] args) {
	String input="hello 123 word 456";
	
	Pattern pattern=Pattern.compile("\\d+");
	
	Matcher matcher=pattern.matcher(input);
	
	while(matcher.find()) {
		
		System.out.println(matcher.group());
		
	}
	
}
}

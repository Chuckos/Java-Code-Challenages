package string_Challenages;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class java_Regex_2 {
	
	 public static void main(String[] args) {

		    // Write a RegEx that will match any repeated word.
	        String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
	        
	        // added case insensitive regex matching
	        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

	        Scanner in = new Scanner(System.in);
	        
	        //parse a string as a decimal integer
	        int numSentences = Integer.parseInt(in.nextLine());
	        
	        while (numSentences-- > 0) {
	            String input = in.nextLine();
	            
	            //matches sequence 
	            Matcher m = p.matcher(input);
	            
	            // Check for subsequences of input that match the compiled pattern
	            while (m.find()) {
	                input = input.replaceAll(m.group(0), m.group(1));
	            }
	            
	            // Prints the modified sentence.
	            System.out.println(input);
	        }
	        
	        in.close();
	    }

}

package string_Challenages;

import java.io.*;
import java.util.*;

public class java_Strings_Introduction {
	
	  public static void main(String[] args) {
	        
		  	Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        sc.close();
	        
	        /* Add String A and B, sum of the lengths */
	        System.out.println(A.length()+B.length());
	        
	        /* Check if String A is higher in the Alphabet than string B using compare method and ternary operator */
	        int lexicographically = A.compareTo(B);
	        String result = (lexicographically > 0) ? "Yes" : "No";
	        System.out.println(result);
	       
	        
	        /* capitalize the first letter in both Strings and  and print them on a single line, separated by a space */
	        String C = A.substring(0, 1).toUpperCase() + A.substring(1);
	        String D = B.substring(0, 1).toUpperCase() + B.substring(1);
	        		
	        //Print out results.
	        System.out.printf("%s %s", C,D);   		
	    }

}

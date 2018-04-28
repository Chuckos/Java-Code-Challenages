package string_Challenages;

import java.io.*;
import java.util.*;


public class Java_Anagrams {
	
	static boolean isAnagram(String a, String b) {
         // Complete the function
		//make both strings lower case, so they are case insensitive when comparing
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		//sort string into alphabetical order using string function for sorting created
		a = alphabSortString(a);
		b = alphabSortString(b);

		//then compare for a equal match or not on both strings letters and sequence and return boolean value true or false
		return a.equals(b);
    }
	
	//created a function to sort string into alphabetical order
	public static String alphabSortString(String inputString) {
		
		//apply Apply toCharArray() method on input string to create a char array for input string.
		char[] tempArray = inputString.toCharArray();
		
		//Use Arrays.sort(char c[]) method to sort char array.
		Arrays.sort(tempArray);
		
		//Use String class constructor to create a sorted string from char array. Return alphabetical order string
		return new String(tempArray);	
		
	}
	
	public static void main(String[] args) {
		    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}
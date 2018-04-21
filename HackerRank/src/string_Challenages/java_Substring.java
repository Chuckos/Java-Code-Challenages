package string_Challenages;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class java_Substring {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	        
	        //Print the substring in the inclusive range from start to end - 1.
	        
	        String X = S.substring(start, end);
	        System.out.println(X);
	    }
	}

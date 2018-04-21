package string_Challenages;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

	
public class java_Substring_Comparisons {
	
	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";			
	        String largest = "";
	        
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        
	        //created an arrayList to store substring data.
	        ArrayList<String> obj = new ArrayList<String>();
	        
	        //int of where to stop in the string where last substring data can be captured.
	        int A = s.length() - k;
	        
	        //Does a substring on every char in the string that possible.
	        for (int i = 0; i <= A; i++) {
	        		String X = s.substring(i, k);
	        		//Store the return substring in an array.
	        		obj.add(X);
	        		//substring end number is incremented to move up to next char in string as well as start number which is i
	        		k++;
	        }
	        
	      //Does a lexicographically sort on the arrayList to put strings in order
	        Collections.sort(obj);
	        
	       
	      //Get the lowest and highest value from the ArrayList and adds to variable strings.
	        
	        //store the element from index 0 of ArrayList
	        smallest = obj.get(0);
	        
	        //Gets the element of last index from ArrayList. 
	        largest = obj.get(obj.size()-1);
	        
	        System.out.println(smallest + " " + largest);
	        
	        
	        
	      
	        
	        return smallest + "\n" + largest;
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	}

package introduction_Challenges;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_End_Of_File {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	 Scanner in = new Scanner(System.in);
    	 
    	 // Using a for loop statement
    	 for (int i = 1; in.hasNext() == true; i++) {
    		 System.out.print(i + " "+ in.nextLine() + "\n"); 		 
    	 }
    	 
	 
    	 // Using a while statement & printf command
    	 
    	 /*int x = 1; 
	 while (in.hasNext()) {
		 String z = in.nextLine();
		 System.out.printf("%d %s\n",x,z);
		 x++;
    }*/
}
    }
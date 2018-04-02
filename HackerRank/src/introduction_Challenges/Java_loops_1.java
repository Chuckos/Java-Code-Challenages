package introduction_Challenges;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_loops_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        if (N >= 2 && N <=20 ) {
        	   for (int i = 1; i <= 10; i++ ) {
        		   int result = N * i;
        		   //System.out.println(N + " x " + i + " = " + result);
        		   System.out.printf("%d x %d = %d%n",N,i,result);
        	   }
        	
        }
        
    }
}


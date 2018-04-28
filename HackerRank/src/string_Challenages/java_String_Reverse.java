package string_Challenages;

import java.io.*;
import java.util.*;

public class java_String_Reverse {
	
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
      /* Reversing String using converting String into Bytes: 
       * 
        // can't reverse a string in java because it's immutable so
        // convert string into bytes by get bytes method
        byte[] reverseStringByteArray = A.getBytes();
        
        byte[] result = new byte [reverseStringByteArray.length];
        // store results in reverse order into the the result byte[]
        for (int i = 0; i < reverseStringByteArray.length; i++) {
        	 result[i] = reverseStringByteArray[reverseStringByteArray.length-i-1]; 
        }
        
        //Covert results byte array back to string.
        String finalReverseString = new String(result);
        */
        
        //Reverse a string by using the StringBuilder.
        
        StringBuilder finalReverseString = new StringBuilder();
        
        // append a string into StringBuilder finalReverseString
        finalReverseString.append(A);
        
        // reverse string finalReverseString
        finalReverseString = finalReverseString.reverse();
        
        // converted stringBuilder to string so I could compare string
        String cake = finalReverseString.toString();
        
       
        //using the string.equals methods to compare content of both objects A and finalReverseString
        // using == will only checks if both string objects use the same memory location
        // if (A.equals(finalReverseString)) {  //This is for the code using bytes to reverse string.
        if (A.equals(cake)) {
        	System.out.println("Yes");
        	
        } else {
        	System.out.println("No");
        }
        
    }
}

package introduction_Challenges;

import java.util.*;
import java.text.*;

public class Java_Currency_Formatter {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        /*Create NumberFormats using locales and for india had to create the custom local using IANA Language Substag Registry */
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale ("en","IN"));
        
        //using the format and payment currency to convert into the local currency.
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
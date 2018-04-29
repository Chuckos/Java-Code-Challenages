package string_Challenages;

import java.util.Scanner;
import java.util.regex.*;

/*
 * Refactored Version
 * 
 * */

public class java_Pattern_Syntax_Checker2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		while (testCases > 0) {
			String pattern = in.nextLine();

			// checks if string syntax pattern is a valid regex
			try {
				// check syntax is valid and print out if try
				Pattern.compile(pattern);
				System.out.println("Valid");

			} catch (Exception e) {
				// if regex is invalid syntax error print out exception.
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
}
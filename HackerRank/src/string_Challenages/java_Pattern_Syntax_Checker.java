package string_Challenages;

import java.util.Scanner;
import java.util.regex.*;

public class java_Pattern_Syntax_Checker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while (testCases > 0) {
			String pattern = in.nextLine();

			// Write your code
			// String variable to capture exception
			String Hope = "";

			// checks if string syntax pattern is a valid regex
			try {
				// check syntax is valid.
				Pattern.compile(pattern);

			} catch (Exception e) {
				// catches exception as a string
				Hope = e.toString();
			}

			// Using ternary operator (if-then-else) to determine if pattern is a match or
			// not in terms of string syntax pattern is valid regex
			System.out.println((Hope.length() == 0) ? "Valid" : "Invalid");

			// reset variable for next loop around
			Hope = "";

		}
	}
}
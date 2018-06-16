package string_Challenages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class java_Regex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
			}

	}

	// Write a class called MyRegex, class has to be private
	public static class MyRegex {

		// needs to deal with strings containing any combination of ASCII characters.
		// Write a regular expression used to validate an IP address.
		// https://www.regular-expressions.info/numericranges.html

		public String pattern = "\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";

	}

}

// Regex contains a string pattern

// needs to deal with strings containing any combination of ASCII characters.

// Write a regular expression used to validate an IP address. (1)
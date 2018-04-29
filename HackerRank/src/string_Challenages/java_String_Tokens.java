package string_Challenages;

import java.io.*;
import java.util.*;

public class java_String_Tokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// required for test case 9 where input is empty string
		if (!scan.hasNext()) {
			System.out.println(0);
			scan.close();
			return;
			
		}

		String s = scan.nextLine();
		scan.close();

		// Write your code here.
		// create regular expressions to split string into tokens
		String regex = "[ .,?!'@_]+";

		// store regular expressions results into string array using trim to removed
		// leading or
		// trailing whitespaces
		String[] splitStringArray = s.trim().split(regex);

		// print out number of tokens using length of array.
		System.out.println(splitStringArray.length);

		// Using a for loop to iterate over string array to print out content of each
		// index.
		for (String printStrings : splitStringArray)
			System.out.println(printStrings);

	}

}

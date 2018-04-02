package introduction_Challenges;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Static_Initializer_Block {
	static Scanner in = new Scanner(System.in);
	static int B = in.nextInt();
	static int H = in.nextInt();
	static boolean flag;//boolean flag;
	
	//public static int B;
	//public static int H;
	
	static {
		if (B <= 0 || H <= 0) {
			System.out.print("java.lang.Exception: Breadth and height must be positive");
		} else {
		flag = true;
		}
	}
	
	

public static void main(String[] args){
	if(flag){
		int area=B*H;
		System.out.print(area);
	}
	
}//end of main

}//end of class

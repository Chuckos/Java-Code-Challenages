package introduction_Challenges;
import java.util.*;
import java.security.*;
public class Java_Int_to_String {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below
   
   // Convert using Integer.toString(int)
   //String s = Integer.toString(n);
   
   // Convert using String.valueOf(int)
   //String s = String.valueOf(n);
   
   // Convert using Integer(int).toString(), This methods uses instance of Integer class to invoke it’s toString() method.
   Integer objectName = new Integer(n);
   String s = objectName.toString();
   
  

   
   
   if (n == Integer.parseInt(s)) {
	    System.out.println("Good job");
	   } else {
	    System.out.println("Wrong answer.");
	   }
	  } catch (DoNotTerminate.ExitTrappedException e) {
	   System.out.println("Unsuccessful Termination!!");
	  }
	 }
	}

	//The following class will prevent you from terminating the code using exit(0)!
	class DoNotTerminate {

	 public static class ExitTrappedException extends SecurityException {

	  private static final long serialVersionUID = 1;
	 }

	 public static void forbidExit() {
	  final SecurityManager securityManager = new SecurityManager() {
	   @Override
	   public void checkPermission(Permission permission) {
	    if (permission.getName().contains("exitVM")) {
	     throw new ExitTrappedException();
	    }
	   }
	  };
	  System.setSecurityManager(securityManager);
	 }
	}

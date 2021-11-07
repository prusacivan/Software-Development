// @author Ivan Prusac

import java.util.Scanner;

public class LoginNameBuilderApp{

	public static void main(String[] args){

		// declare local variables
		Scanner input = new Scanner(System.in);
		String n;
		String s;
		// declare variable of type LoginNameBuilder
	LoginNameBuilder logObj;
    logObj = new LoginNameBuilder ();
		// here we are asking for input (surname and name)
	System.out.println("enter name");
		n = input.nextLine();
		// we use setter method to send input to inst. class
	logObj.setName(n);
   System.out.println("enter surname");
   		s = input.nextLine();
	// here we do processing of input using inst. class
    logObj.logBuild();

    // at the end we display login name using getter method
    String logIn = logObj.getLoginName ();

    System.out.println ("This is your new login name: "+ s + logIn);
}
}


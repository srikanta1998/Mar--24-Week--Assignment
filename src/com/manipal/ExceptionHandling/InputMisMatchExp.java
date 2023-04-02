package com.manipal.ExceptionHandling;
import java.util.*;

public class InputMisMatchExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputMisMatchExp ref = new InputMisMatchExp();
		ref.inputMisFunction();
		System.out.println("Program exited!");
	}
	
	void inputMisFunction()
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter an integer : ");
		 
			/*
			 * InputMismatchException is thrown when the program is expecting a certain type
			 * of input from the user, but the actual input provided by the user does not
			 * match the expected type. This can occur, for example, when the program
			 * expects an integer input, but the user enters a string.
			 */
		 
		 try {
			 
			 int input = sc.nextInt();
			 System.out.println("Thank You for Entering an Integer!");
			 
		 }catch (InputMismatchException ie)
		 {
			 System.out.println("Entered Input is not an Integer! "+ie);
		 }
		
	}

}

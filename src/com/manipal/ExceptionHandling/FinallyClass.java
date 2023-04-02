package com.manipal.ExceptionHandling;
import java.util.*;

public class FinallyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		finallyMethod();
		System.out.println("Program exited!");
		
	}
	
	static void finallyMethod()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer : ");
		
		//The finally block contains code that will be executed regardless of whether an
		//exception is thrown or not. This is useful for cleaning up resources, such as
		//closing files or network connections, that were opened in the try block.
		
		//finally block will always be executed, even if the try or catch block contains a
		//return statement.
		
		try {
			 
			 int input = sc.nextInt();
			 System.out.println("Thank You for Entering an Integer!");
			 
		 }catch (InputMismatchException ie)
		 {
			 System.out.println("Entered Input is not an Integer! "+ie);
		 }
		finally{
			System.out.println("Finally block executed!");
			sc.close();
		}
	}

	
}

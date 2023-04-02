package com.manipal.ExceptionHandling;
import java.util.*;

public class DefaultException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		defExpFunction();
		System.out.println("Program exited!");

	}

	static void defExpFunction()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer : ");
		
		/*
		 * Exception class is the superclass of all exceptions (sub-classes)including both checked
		 * and unchecked exceptions. The Exception class is used to define and create
		 * custom exceptions that can be thrown by a Java program. custom exception classes
		 * can be created by extending the Exception class or one of its subclasses.*/
		
		try {
			 
			 int input = sc.nextInt();
			 System.out.println("Thank You for Entering an Integer! : "+input);
			 
		// Here we are using Exception in place of InputMismatchException 	 
		 }catch (Exception ie)
		 {
			 System.out.println("Entered Input is not an Integer! "+ie);
			 System.out.println("Printing getCause() -> "+ie.getCause());
		 
	}
	
	}
}
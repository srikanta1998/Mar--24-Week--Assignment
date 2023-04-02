package com.manipal.ExceptionHandling;
import java.util.*;

public class ThrowsExp {

	// using throws outside the main method/ calling from another class than should
	// extends custom exception class or should implement try catch block.
	
	public static void main(String[] args) throws CustomExpClass {
		// TODO Auto-generated method stub
		
		throwsMethod();
		System.out.println("Program Exited!");

	}
	
	static void throwsMethod() throws CustomExpClass
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string for passowrd in int format : ");
		
		//custom exception is mainly used for run time errors / logical errors early detection
		try {
			
			int password = sc.nextInt();
			int length = String.valueOf(password).length();
			
			//throws key word is same as throw whereas using throws custom exception and
			//inbuilt exception classes can be implemented
			
			//throws is used to create object for custom exception class/ inbuilt exception class
			//and load it with the message
			
			if(length != 8)
			{
				throw new CustomExpClass("Password length should be 8!");
			}
			
			System.out.println("Passowrd is of valid Type.");
			
		}catch (CustomExpClass | InputMismatchException ce)
			{
				System.out.println(ce.getMessage());
				ce.printStackTrace();
			}
		}
		
	}

	// custom exception class extends Exception class (Super class)
	  class CustomExpClass extends Exception
	{
		 // the message passed as argument inside the constructor by throw while creating object
		 //will be passed to Exception class (Super Class)
		 
		CustomExpClass(String msg)
		{
			super(msg);
		}

}

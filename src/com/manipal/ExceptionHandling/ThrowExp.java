package com.manipal.ExceptionHandling;
import java.util.*;

public class ThrowExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		throwMethod();
		System.out.println("Program exited!");

	}
	
	static void throwMethod()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string for passowrd : ");
		String password = sc.nextLine();
		//custom exception is mainly used for run time errors / logical errors early detection
		try {
			
			//throw key word is used to create object for custom exception class and
			//load it with the message
			if(password.length() != 8)
			{
				throw new CustomExpClass("Password length should be 8!");
			}
			
			System.out.println("Passowrd is of valid Type.");
			
		}catch (CustomExpClass ce)
			{
				System.out.println(ce.getMessage());
				//ce.printStackTrace();
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

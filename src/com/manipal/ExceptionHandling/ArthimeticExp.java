package com.manipal.ExceptionHandling;
import java.util.*;

public class ArthimeticExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkFunction();
		System.out.println("Program exited!");
		
	}
	
	/*
	 * Arithmetic Exception class is used to handle runtime arithmetic errors, such
	 * as divide-by-zero errors or performing a mathematical operation that results
	 * in a value that is too large or too small to be represented by the data type.
	 */
	
	static void checkFunction()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Dividend and divisor : ");
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		System.out.println("");
		
		try {
			int c = dividend%divisor;
			System.out.println("Remainder of "+dividend+"/"+divisor+" is : "+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Dividend/Divisor cannot be Zero! "+ae);
			System.out.println("Printing getMessage() -> "+ae.getMessage());
		}
	}

}

package com.manipal.ExceptionHandling;
import java.util.*;

public class NumberFormatExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numFormat();
		System.out.println("Program exited!");
	}

	static void numFormat()
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		System.out.print("Enter a number : ");
		str = sc.nextLine();
		
		/*
		 * Number Format Exception is an error that occurs when a program tries to parse
		 * or format a string into a numeric data type, but the string is not in a valid
		 * format.
		 */
		
		try {
			int number = Integer.parseInt(str);
			System.out.println("Entered number is : "+number);
		}catch(NumberFormatException ne)
		{
			System.out.println("Entered input is nott integer! "+ne);
		}
		
	}
	
}
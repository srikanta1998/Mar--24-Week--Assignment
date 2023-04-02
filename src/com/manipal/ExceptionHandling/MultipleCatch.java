package com.manipal.ExceptionHandling;
import java.util.*;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mulCatchMethod();
		System.out.println("Program exited!");
	}
	
	static void mulCatchMethod()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Dividend and divisor : ");		
		
		//Instead of multiple catch blocks we can use one catch block for multiple exceptions
		try {
			int dividend = sc.nextInt();
			int divisor = sc.nextInt();
			System.out.println("");
			int c = dividend%divisor;
			System.out.println("Remainder of "+dividend+"/"+divisor+" is : "+c);
			
		}catch (InputMismatchException | ArithmeticException   e)
		{
			System.out.println(e);
		}
	}

}

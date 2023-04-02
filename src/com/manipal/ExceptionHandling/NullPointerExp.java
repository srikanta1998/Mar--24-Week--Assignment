package com.manipal.ExceptionHandling;
import java.util.*;

public class NullPointerExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		nullFunction();
		System.out.println("Program exited!");
		
	}
	static void nullFunction()
	{
		//Scanner sc = new Scanner(System.in);
		
		String name = null;
		System.out.println("Enter your name : ");
		//name = sc.nextLine();
		
		/* Null Pointer Exception (NPE) is an error that occurs 
		 * When a variable is not initialized.
		 * When a method returns null.
		 * When an object is explicitly set to null.
		 * When an array element is not initialized.*/
		
		try {
			
			System.out.println("Length of your name is : "+name.length());
		}catch (NullPointerException ne)
		{
			System.out.println("Field cannot be blank!");
			ne.printStackTrace();
		}
		
	}
}

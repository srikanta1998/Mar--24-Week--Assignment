package com.manipal.ExceptionHandling;
import java.util.*;

public class ArrayIndexOutOfBoundsExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ayyIndFunction();
		System.out.println("Program exited!");
		
	}
	
	static void ayyIndFunction()
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		System.out.println("Size of the array is : "+arr.length);
		System.out.print("Enter a index number to retrive the elemnet : ");
		int ch = sc.nextInt();		
		
		/*
		 * ArrayIndexOutOfBoundsException is thrown when you try to access an element in
		 * an array using an index that is outside of the valid range of indices for
		 * that array.
		 */
		try {
			
				System.out.print("Element at index number "+ch+" is : "+arr[ch-1]);
			
		}catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Invalid index number! "+ae);
		}
	}

}

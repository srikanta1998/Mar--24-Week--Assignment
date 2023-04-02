package com.manipal.DataAbstraction;
import java.util.*;

public class AbstractClass_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape obj1 = new Square(10);
		obj1.area();
		
		Shape obj2 = new Rectangle(20,10);
		obj2.area();
		

	}
}
	
	abstract class Shape {
		
		abstract void area();
	}
	
	class Square extends Shape {

		double side;
		Square(double side) {
			this.side = side;
		}
		
		@Override
		void area() {
			// TODO Auto-generated method stub
			
			System.out.println("The area of the square is : "+side*side);
		}		
	}
	
	class Rectangle extends Shape {
		long length,breadth;
		Rectangle(long length, long breadth) {
			this.length = length;
			this.breadth = breadth;
		}
		
		@Override
		void area() {
			// TODO Auto-generated method stub
			System.out.println("\nThe area of the rectangle is : "+length*breadth);
		}
		
	}

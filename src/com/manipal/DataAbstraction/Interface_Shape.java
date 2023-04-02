package com.manipal.DataAbstraction;

public class Interface_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape1 obj1 = new Square1(10);
		obj1.area();
		
		Shape1 obj2 = new Rectangle1(20,10);
		obj2.area();
	}

}

interface Shape1
{
	void area();
}

class Square1 implements Shape1
{
	
	int a,area;
	Square1(int a) {
		this.a =a;
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		area = a*a;
		System.out.println("The area of square is : "+area);
	}
	
}

class Rectangle1 implements Shape1
{
	int area;
	Rectangle1(int length, int breadth) {
		area = length*breadth;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("\nThe area of rectangle is : "+area);
	}
	
}
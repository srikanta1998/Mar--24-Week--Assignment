package com.manipal.DataAbstraction;

public class Interface_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 obj1 = new Sedan1();
		obj1.typeOfCars();
		
		Car1 obj2 = new SUV1();
		obj2.typeOfCars();
		
		Car1 obj3 = new HatchBack1();
		obj3.typeOfCars();

	}

}

interface Car1
{
	void typeOfCars();
}

class Sedan1 implements Car1 {

	@Override
	public void typeOfCars() {
		// TODO Auto-generated method stub
		System.out.println("\nThis car is of sedan type!");
	}		
}

class SUV1 implements Car1 {

	@Override
	public void typeOfCars() {
		// TODO Auto-generated method stub		
		System.out.println("\nThis car is of SUV type!");
	}		
}

class HatchBack1 implements Car1 {

	@Override
	public void typeOfCars() {
		// TODO Auto-generated method stub		
		System.out.println("\nThis car is of HatchBack type!");
	}		
}
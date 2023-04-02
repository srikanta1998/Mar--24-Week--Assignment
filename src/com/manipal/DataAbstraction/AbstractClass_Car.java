package com.manipal.DataAbstraction;
import java.util.*;

public class AbstractClass_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj1 = new Sedan();
		obj1.display();
		obj1.typeOfCars();
		
		Car obj2 = new SUV();
		obj2.typeOfCars();
		
		Car obj3 = new HatchBack();
		obj3.typeOfCars();
	}
}
	
	abstract class Car
	{
		abstract void typeOfCars();
		
		void display()
		{
			System.out.println("Welcome to AutoExpo 2023!!!");
		}
	}
	
	class Sedan extends Car {
		
		@Override
		void typeOfCars() {
			// TODO Auto-generated method stub
			
			System.out.println("\nThis car is of sedan type!");			
		}	
	}
	class SUV extends Car {

		@Override
		void typeOfCars() {
			// TODO Auto-generated method stub
			
			System.out.println("\nThis car is of SUV type!");
		}		
	}
	class HatchBack extends Car {

		@Override
		void typeOfCars() {
			// TODO Auto-generated method stub
			
			System.out.println("\nThis car is of HatchBack type!");			
		}
		
	}

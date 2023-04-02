package com.manipal.Oops.DataAbstraction;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample1 obj = new Define1();
		obj.display();
	}

}
interface Sample1 {
	
	//all methods in the interface are by default abstract hence no need to define the abstract keyword
	 void display();
}

class Define1 implements Sample1 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Abstraction is implemented!");
	}
	
}

package com.manipal.Oops.DataAbstraction;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Define();
		obj.display();
	}

}

abstract class Sample {
	
	abstract void display();
}

class Define extends Sample {

	@Override
	 void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstraction is defined!");
	}
	
}
package com.manipal.Oops.Inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 obj1 = new Car1();
		
		obj1.design();
		
		Brand obj2 = new Brand();
		
		obj2.msg = "\nThis is Sedan Segment!";
		
		obj2.design();
		
		obj2.brandName();
	}

}

class Car1 {
	
	String msg ;
	
	void design()
	{
		System.out.println("There are 5 segments in a car!");
	}
}

class Brand extends Car1 {
	
	void design()
	{
		System.out.println(msg);
	}
	
	void brandName()
	{
		System.out.println("\nFrom the GLS Model of BenZ!");
	}
}
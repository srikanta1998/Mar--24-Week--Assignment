package com.manipal.DataAbstraction;

public class Interface_Coach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coach1 obj1 = new Coach1("Now both of the methods are calling from one class object\n");
		obj1.research();
		obj1.teaches();
		
		Professor obj2 = new Coach1("Now the research method is calling from Professor interface ref var.");
		obj2.research();
		
		Lecturer obj3 = new Coach1("\nNow the teaches method is calling from Lecturer interface ref var.");
		obj3.teaches();
	}

}

interface Professor
{
	void research();
}

interface Lecturer
{
	void teaches();
}

class Coach1 implements Professor,Lecturer
{
	
	Coach1(String a) {
		System.out.println(a);		
	}

	@Override
	public void teaches() {
		// TODO Auto-generated method stub
		System.out.println("Lecturer responsibility is teaching.\n");
	}

	@Override
	public void research() {
		// TODO Auto-generated method stub
		System.out.println("Professor responsibility is guiding in research.");
	}
	
}
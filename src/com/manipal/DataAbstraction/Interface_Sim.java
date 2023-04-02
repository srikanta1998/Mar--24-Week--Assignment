package com.manipal.DataAbstraction;

public class Interface_Sim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sim1 obj1 = new Jio1();
		obj1.simCard();
		
		Sim1 obj2 = new Airtel1();
		obj2.simCard();
	}
}

interface Sim1 {
	
	void simCard();
}

class Jio1 implements Sim1
{
	@Override
	public void simCard() {
		// TODO Auto-generated method stub
		System.out.println("Jio focuses more on effordability and availability!");
	}
}

class Airtel1 implements Sim1
{
	@Override
	public void simCard() {
		// TODO Auto-generated method stub
		System.out.println("\nAirtel focuses more on quality and connectivity!");	
	}
	
}
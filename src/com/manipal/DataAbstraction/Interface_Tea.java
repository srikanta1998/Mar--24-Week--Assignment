package com.manipal.DataAbstraction;

public class Interface_Tea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tea1 obj = new Flavour();
		obj.lemonTea();
		obj.greenTea();
	}

}

interface Tea1
{
	void lemonTea();
	
	void greenTea();
}

class Flavour implements Tea1
{

	@Override
	public void lemonTea() {
		// TODO Auto-generated method stub
		System.out.println("Lemon tea is often used as a natural remedy for sore throat, cough, and cold.");
	}

	@Override
	public void greenTea() {
		// TODO Auto-generated method stub
		System.out.println("\ngreen tea is considered to be high in antioxidant content and lower levels of sugar.");
	}
	
}
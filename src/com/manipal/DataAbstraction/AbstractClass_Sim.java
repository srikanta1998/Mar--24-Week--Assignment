package com.manipal.DataAbstraction;
import java.util.*;

public class AbstractClass_Sim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sim obj1 = new Jio();
		obj1.simCard();
		
		Sim obj2 = new Airtel();
		obj2.simCard();
		
		Sim obj3 = new Vodafone();
		obj3.simCard();
		
	}
}

abstract class Sim {
	
	abstract void simCard();
}

class Jio extends Sim {

	@Override
	void simCard() {
		// TODO Auto-generated method stub
		System.out.println("This Sim is from Jio!");
	}
}
	
class Airtel extends Sim {

	@Override
	void simCard() {
		// TODO Auto-generated method stub
		System.out.println("\nThis Sim is from Airtel!");
	}
	
}

class Vodafone extends Sim {

	@Override
	void simCard() {
		// TODO Auto-generated method stub
		System.out.println("\nThis Sim is from Vodafone!");
	}
	
}
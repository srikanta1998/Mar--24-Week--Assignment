package com.manipal.DataAbstraction;
import java.util.*;

public class AbstractClass_Tea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tea obj1 = new LemonTea();
		obj1.flavour();
		
		Tea obj2 = new GreenTea();
		obj2.flavour();
		
		Tea obj3 = new GingerTea();
		obj3.flavour();

	}
}

abstract class Tea {
	
	abstract void flavour();
	
}

class LemonTea extends Tea {

	@Override
	void flavour() {
		// TODO Auto-generated method stub
		System.out.println("Tea is flavoured as LemonTea!");
	}	
}

class GreenTea extends Tea {

	@Override
	void flavour() {
		// TODO Auto-generated method stub
		System.out.println("\nTea is flavoured as GreenTea!");
	}	
}

class GingerTea extends Tea {

	@Override
	void flavour() {
		// TODO Auto-generated method stub
		System.out.println("\nTea is flavoured as GingerTea!");
	}
	
	
}
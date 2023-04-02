package com.manipal.Oops.Inheritance;

public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhysicsLab obj1 = new PhysicsLab();
		
		obj1.education();
		obj1.department();
		obj1.laboratory();
		
		Principal obj2 = new Principal();
		
		obj2.education();
		obj2.role();

	}

}

class Institute {

	String clgName = "Manipal";
	void education()
	{
		System.out.println("\nThe "+clgName+" has a wide variety of courses offered!");
	}
}

class PhysicsDept extends Institute {
	
	void department()
	{
		System.out.println("\nPhysics dept. at "+clgName+" institution carries out most research work than any other Dept.");
	}
	
}

class PhysicsLab extends PhysicsDept {
	
	void laboratory()
	{
		System.out.println("\nLaboratory at physics dept of "+clgName+" Institution covers practical education.");
	}
}

class Principal extends Institute {
	
	void role()
	{
		System.out.println("\nPrincipal is the chief execeutive, administrator and controller of the "+clgName+" Institution");
	}
}
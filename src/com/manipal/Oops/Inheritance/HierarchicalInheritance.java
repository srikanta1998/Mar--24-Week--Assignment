package com.manipal.Oops.Inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 obj1 = new Employee1();
		
		Employee2 obj2 = new Employee2();
		
		obj1.bonus();
		obj1.bonus1();
		
		obj2.bonus();
		obj2.bonus2();

	}

}

class Employer {

	String amount = "5000rs";
	void bonus()
	{
		System.out.println("\nBonus of "+amount+" is added to employees salaries");
	}
}

class Employee1 extends Employer {
	
	void bonus1()
	{
		System.out.println("Salary is hiked with "+amount+" after bonus, for employee1.");
	}
	
}

class Employee2 extends Employer {
	
	void bonus2()
	{
		System.out.println("Salary is hiked with "+amount+" after bonus, for employee2.");
	}
}
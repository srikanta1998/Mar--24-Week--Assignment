package com.manipal.DataAbstraction;
import java.util.*;

public class AbstractClass_Coach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coach obj1 = new TechnicalCoach("Technical");
		obj1.teaches();
		
		Coach obj2 = new SoftSkillsCoach("Soft-Skills");
		obj2.teaches();
		
	}
}

abstract class Coach {
	
	Coach(String a)
	{
		System.out.println(a+" Coach shapes our skills and skills builds our career");
	}
	
	abstract void teaches();
}

class TechnicalCoach extends Coach {
	
	TechnicalCoach(String a)
	{
		super(a);
	}

	@Override
	void teaches() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("Technical Coach teaches subjects like Java, Python, Sql...");
		System.out.println("");
	}
}

class SoftSkillsCoach extends Coach {
	
	SoftSkillsCoach(String a){
		super(a);
	}
	
	@Override
	void teaches() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("Soft-Skills Coach helps in improving the communication by practicing.");
		System.out.println("");
	}
	
	
}
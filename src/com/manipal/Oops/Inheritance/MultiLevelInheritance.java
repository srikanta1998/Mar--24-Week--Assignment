package com.manipal.Oops.Inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son obj = new Son();
		
		obj.ancestorsProperty();
		obj.eldersProperty();
		obj.ownProperty();

	}

}

class GrandFather {
	String msg = "inherited";
	void ancestorsProperty()
	{
		System.out.println("Grand Father is the legal heir of the "+msg+" property.");
	}
}

class Father extends GrandFather{
	
	void eldersProperty()
	{
		System.out.println("\nFather is the legal heir of the "+msg+" property.");
	}
}

class Son extends Father {
	 void ownProperty()
	 {
		 System.out.println("\nSon is the legal heir of the "+msg+" property.");
	 }
}
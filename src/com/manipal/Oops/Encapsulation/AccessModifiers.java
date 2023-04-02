package com.manipal.Oops.Encapsulation;

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Person person = new Person("Srikanta", 24);
        
        System.out.println(person.getInfo());
	}

}

class Person {
	
    // Private instance variables
    private String name;
    private int age;
    
    // Public constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Public method to get the person's name and age
    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}
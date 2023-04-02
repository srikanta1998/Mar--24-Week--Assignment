package com.manipal.Oops.Encapsulation;

public class GettersSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get the person's name and age by using the constructor and getting value by toString().
        Person1 obj = new Person1("Srikanta Raju", 14);
        
        System.out.println("Before modification: " + obj);
        
        // Use the setter methods to modify the person's name and age
        obj.setName("Srikanta Sriee");
        obj.setAge(24);
        
        // Use the Getter methods to get the person's name and age
        obj.getName();
		obj.getAge();
        
        System.out.println("\nAfter modification: " + obj);

	}

}

class Person1 {
	
    private String name;
    private int age;
    
    // Public constructor
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Public getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Public setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}
    
   
}

package com.manipal.Oops.Polymorphism;

public class MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        
        myAnimal.makeSound();
        
        myDog.makeSound();

	}

}

class Animal {
    public void makeSound() {
        System.out.println("\nThe animal makes a sound.");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("\nThe dog barks.");
    }
}
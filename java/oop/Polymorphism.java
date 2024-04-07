package oop;

import java.util.ArrayList;

public class Polymorphism {
    public static void main(String[] args) {
        
        //* With polymorphism, you can use a subclass object wherever a superclass object is expected.
        Animal animal = new Dog();
        //! But the other way around is not possible.
        // Dog dog = new Animal();
        
        //! You can only access the superclass methods.
        // animal.speak();
        //* But if the method is also implemented in the subclass, it will call the subclass method.
        animal.sleep();
        
        //! If you store subclass objects in a superclass array, you can't assign them to a subclass variable.
        ArrayList<Animal> dogs = new ArrayList<>();
        dogs.add(new Dog());
        // Dog dog = dogs.get(0);
        //* If you want to access subclass methods that are not in the superclass, you must cast the object.
        Dog dog = (Dog) dogs.get(0);
        dog.speak();
        
        //* To check the class (or superclass) of the object, you can use the "instanceof" operator.
        System.out.println(animal instanceof Dog);
        System.out.println(animal instanceof Animal);
        
        getAnimal();
        feedAnimal(new Dog());
    }
    
    //* You can return a subclass object from a method that expects a superclass.
    public static Animal getAnimal() {
        return new Dog();
    }
    
    //* And you can pass a subclass object to a method that expects a superclass.
    public static void feedAnimal(Animal animal) {
        System.out.println("Feeding animal...");
    }
}

class Animal {
    void sleep() {
        System.out.println("Sleeping...");
    }
    
    Animal eat() {
        System.out.println("Eating...");
        return new Animal();
    }
    
    void print(Animal animal) {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println("Sleeping like a dog...");
    }
    
    void speak() {
        System.out.println("Woof!");
    }
     
    //* When overriding a method, parameters must be the SAME, and return types must be COMPATIBLE.
    //* That means the return type can be a subclass, and the parameter names can be different.
    Dog eat() {
        System.out.println("Eating like a dog...");
        return new Dog();
    }
    
    //! But making the parameter type a subclass is not overriding, it's overloading.
    void print(Dog dog) {
        System.out.println("Dog");
    }
}

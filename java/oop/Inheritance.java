package oop;

public class Inheritance {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        
        //* Subclasses can access all public and protected members of its superclass
        sub.printHello();
        //* And they can override methods of its superclass
        sub.printBye();
        
        //* You can overload methods by using the same name but different parameter types
        //* When calling an overloaded method, it will look for the method that matches the parameters
        sub.printHello("John");
    }
}

class SuperClass {
    void printHello() {
        System.out.println("Hello");
    }
    
    void printBye() {
        System.out.println("Bye");
    }
}

//* The subclass "extends" the superclass
class SubClass extends SuperClass {
    
    //* Overriding method
    void printBye() {
        System.out.println("Bye Bye");
    }
    
    //* Overloading method
    void printHello(String name) {
        System.out.println("Hello " + name + "!");
    }
    
    //! You can't weaken the access modifier of the method when overriding
    // private void printHello() { System.out.println("Hello"); }
}
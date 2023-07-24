public class Inheritance {

    //* The subclass "extends" the superclass

    public static void main(String[] args) {
        SubClass sub = new SubClass();

        //* Subclasses can access all public and protected members of its superclass
        sub.printHello();
        //* And they can override methods of its superclass
        sub.printBye();
        //! The return type of the overriding method must be the same as the superclass
        //! You cannot weaken the access modifier of the method when overriding

        //* Some instance variables can be inherited
        sub.message = "Greetings!";
        System.out.println(sub.message);
        //! Private members cannot be inherited but can be accessed through methods
        // System.out.println(sub.id);
        System.out.println(sub.getId());

        //* You can also overload methods in the class (or subclass and so on)
        //* by using the same name but different parameter types or different order of parameters
        //* (parameter names don't matter), and they can have the same or different return types.
        //! But you cannot overload methods by just changing the return type, it will cause an error
        //* When calling the method, it will look for the first method that matches the parameters
        sub.printHello("John");
    }
}

class SuperClass {
    String message;
    private int id = 1234;

    //* With the "final" keyword, the method cannot be overridden
    final int getId() {
        return id;
    }

    void printHello() {
        System.out.println("Hello");
    }

    void printBye() {
        System.out.println("Bye");
    }
}

//* By using the "final" keyword, the class cannot be extended
final class SubClass extends SuperClass {
    void printWorld() {
        System.out.println("World");
    }

    //* Overriding method
    void printBye() {
        System.out.println("Bye Bye");
    }

    //! Overriding method with different return type
    // String printHello() {
    //     System.out.println("Hello");
    //     return "Hello";
    // }

    //! Overriding method with weaker access modifier
    // private void printHello() {
    //     System.out.println("Hello");
    // }

    //* Overloading method
    void printHello(String name) {
        System.out.println("Hello " + name + "!");
    }

    //! Overloading method by changing return type
    // int printHello()  { return 0; }

    //! Method cannot be overridden because it is final
    // int getId() { return id; }
}

//! Class cannot be extended because its superclass is final
// class SubSubClass extends SubClass { }
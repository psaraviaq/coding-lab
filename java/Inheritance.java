public class Inheritance {

    //* The subclass "extends" the superclass

    public static void main(String[] args) {
        SubClass sub = new SubClass();

        //* Subclasses can access all public and protected members of its superclass
        sub.printHello();
        //* And they can override methods of its superclass
        sub.printBye();

        //* Some instance variables can be inherited
        sub.message = "Greetings!";
        System.out.println(sub.message);
        //! Private members cannot be inherited but can be accessed through methods
        // System.out.println(sub.id);
        System.out.println(sub.getId());
    }
}

class SuperClass {
    String message;
    private int id = 1234;

    int getId() {
        return id;
    }

    void printHello() {
        System.out.println("Hello");
    }

    void printBye() {
        System.out.println("Bye");
    }
}

class SubClass extends SuperClass {
    void printWorld() {
        System.out.println("World");
    }

    //* Overriding method
    void printBye() {
        System.out.println("Bye Bye");
    }
}
package oop;

public class Abstraction {
    public static void main(String[] args) {
        //* Abstract classes can't be instantiated
        // Shape shape = new Shape();
        //* But you can still create a reference to it
        Shape shape = new Square();
    }
}

//* If a class has at least one abstract method, it must be abstract itself
//* But an abstract class can have both abstract and non-abstract methods
abstract class Shape {
    
    //* An abstract method doesn't have a body (no curly braces) and ends with a semicolon
    public abstract boolean erase();
    
    //! If the class is extended by a concrete subclass, the abstract method must be implemented
    public abstract Shape draw(Shape shape);
}

//* It it's extended by an abstract subclass, the abstract methods doesn't have to be implemented
abstract class Rectangle extends Shape {
    
    //* But if you do implement it, the next subclass doesn't have to
    public boolean erase() {
        System.out.println("Erasing rectangle");
        return true;
    }
}

//* The concrete subclass must implement all abstract methods that are not implemented by its superclass
class Square extends Rectangle {
    public Rectangle draw(Shape shape) {
        System.out.println("Drawing square");
        return new Square();
    }
}

public class Abstraction {

    public static void main(String[] args) {
        //* Using the "abstract" keyword, we can't create an instance object of the class
        // Shape shape = new Shape();
        //* But we can create an instance object of the subclass, and even use the reference of the superclass
        //* The reference applies also to arrays, parameters, and return types.
        Shape shape = new Circle();

        //* There's also abstract methods, which are methods without a body (no curly braces) and end with a semicolon.
    }
}

//* An abstract class can have both abstract and non-abstract methods
//! But if it has at least one abstract method, the class must be abstract
abstract class Shape {
    public void display() {
        System.out.println("Displaying shape");
    }

    //* An abstract method means it must be overridden.
    public abstract Shape draw(Shape shape);

    public abstract boolean erase();
}

class Circle extends Shape {
    public void display() {
        System.out.println("Displaying circle");
    }

    //* The first concrete subclass of an abstract class must implement all abstract methods
    public Circle draw(Shape shape) {
        System.out.println("Drawing circle");
        return new Circle();
    }

    public boolean erase() {
        System.out.println("Erasing circle");
        return true;
    }

    //! So if this was the only "draw" method, it would be an error because it's not being overridden.
    public Circle draw(Circle circle) {
        System.out.println("Drawing circle");
        return new Circle();
    }
}

//* However, you can pass the buck to the next subclass by being abstract yourself
abstract class Rectangle extends Shape {
    //* You can still though implement some abstract methods so that the next subclass doesn't have to
    public boolean erase() {
        System.out.println("Erasing rectangle");
        return true;
    }
}

class Square extends Rectangle {
    //! But if you don't implement all abstract methods, the concrete subclass must do it.
    public Rectangle draw(Shape shape) {
        System.out.println("Drawing square");
        return new Square();
    }
}


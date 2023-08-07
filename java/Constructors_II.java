public class Super {

    //* "super" is a keyword that refers to the superclass.

    public static void main(String[] args) {

        //* Whenever you create an object, the constructor of the class will first
        //* call the constructor of the superclass, and so on until Object.
        Fruit fruit = new Fruit();

        //* But it can take arguments as well.
        Fruit myFruit = new Fruit("orange");
        System.out.println(myFruit.name);

        //* It can also be used when overriding methods to call the superclass method
        fruit.eat();
    }
}

class Food {
    String name;

    public Food() {
        System.out.println("I am the food constructor");
    }

    public Food(String foodName) {
        name = foodName;
    }

    void eat() {
        System.out.println("This food is great");
    }
}

class Fruit extends Food {

    //* If you don't call super(), the compiler will do it for you.
    public Fruit() {
        super();
    }
    //* So this is valid as well.
    // public Fruit() {}
    //* And this too.
    // public Fruit() {
    //     System.out.println("valid");
    // }
    //! But this is not, because it's not the first statement.
    // public Fruit(String name) {
    //     System.out.println("not valid"");
    //     super();
    // }

    //* When "super" takes arguments, it will call the constructor that matches them.
    public Fruit(String name) {
        super(name);
    }

    void eat() {
        System.out.println("This fruit is great");
        //* When you still want to use the behavior of the superclass version.
        //! This call is optional, and doesn't have to be the first statement.
        super.eat();
    }
}

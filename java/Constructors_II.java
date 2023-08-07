public class Constructors_II {

    //* "super" is a keyword that refers to the superclass.
    //* "this" is a keyword that refers to the current object.
    //! super() and this() can only be used in constructors.
    //! while super. and this. can be used anywhere in the class.

    public static void main(String[] args) {

        //* Whenever you create an object, the constructor of the class will first
        //* call the constructor of the superclass, and so on until Object.
        Fruit fruit = new Fruit();

        //* But it can take arguments as well.
        Fruit myFruit = new Fruit("orange");
        System.out.println(myFruit.name);

        //* It can also be used when overriding methods to call the superclass method
        myFruit.eat();

        //* You can also use "this" to call another constructor.
        Fruit healthyFruit = new Fruit(true);
        System.out.println(healthyFruit.name);
    }
}

class Food {
    String name;
    boolean healthy;

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

    //* If you don't want duplicate code, you can use "this" to call another constructor.
    public Fruit(boolean healthy) {
        this("apple", healthy);
    }

    //* You can also use "this" when the parameter names matches the instance variables.
    public Fruit(String name, boolean healthy) {
        this.name = name;
        this.healthy = healthy;
    }

    void eat() {
        System.out.println("This fruit is great");
        //* When you still want to use the behavior of the superclass version.
        //! This call is optional, and doesn't have to be the first statement.
        super.eat();
    }
}

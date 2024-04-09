package oop;

@SuppressWarnings("unused")
public class Constructors_II {
    
    //* "super" is a keyword that refers to the superclass.
    //* "this" is a keyword that refers to the current object.
    //! super() and this() can only be used inside constructors.
    //! while super. and this. can be used anywhere in the class.
    
    public static void main(String[] args) {
        
        //* When a constructor is called, the first thing it does is call the constructor of the superclass.
        Fruit fruit = new Fruit();
        
        //* You can also use "this" to call another constructor.
        Fruit healthyFruit = new Fruit(true);
        System.out.println(healthyFruit.name);
    }
}

class Fruit extends Food {
    
    //* ------------------ super() and super ------------------
    
    //* If you don't call super(), the compiler will insert it for you as the first statement.
    public Fruit() {
        // super();
        System.out.println("2. I am the fruit constructor");
    }
    
    //* "super()" can also take arguments, but it has to match the constructor of the superclass.
    public Fruit(String name) {
        super(name);
    }
    
    //! "super()" can't be used after the first statement.
    // public Fruit(String name) {
    //     System.out.println("not valid"");
    //     super();
    // }
    
    @Override
    void eat() {
        //* "super." can be used to call a method from the superclass when you still want to use its implementation.
        //! But this call is not required (the compiler won't even insert it), and doesn't have to be the first statement.
        super.eat();
    }
    
    //* ------------------ this() and this ------------------
    
    //* Use "this()" to call another constructor from the same class to avoid code duplication.
    //! It has to be the first statement as well, it's either "this()" or "super()", but not both.
    public Fruit(boolean healthy) {
        this("apple", healthy);
    }
    
    //* "this." is mainly used to avoid name conflicts between instance variables and parameters.
    public Fruit(String name, boolean healthy) {
        this.name = name;
        this.healthy = healthy;
    }
}

class Food {
    String name;
    boolean healthy;
    
    //* super()
    public Food() {
        System.out.println("1. I am the food constructor");
    }
    
    //* super(name)
    public Food(String foodName) {
        name = foodName;
    }
    
    void eat() {
        System.out.println("This food is great");
    }
}

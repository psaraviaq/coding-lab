public class Super {
    public static void main(String[] args) {
        //* Used when overriding methods to call the superclass method
        Fruit fruit = new Fruit();
        fruit.eat();
    }
}

class Food {
    void eat() {
        System.out.println("This food is great");
    }
}

class Fruit extends Food {
    void eat() {
        System.out.println("This fruit is great");
        //* When you still want to use the behavior of the superclass version.
        super.eat();
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        //* With polymorphism, you can use a subclass object wherever a superclass object is expected.
        Animal animal = new Dog();
        //! But the opposite is not true.
        // Dog dog = new Animal();

        //* You can even use them in arrays.
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        //* And loop through them.
        for (Animal a : animals) {
            System.out.println(a);
            //* With their overridden methods.
            a.sleep();
            //! But the methods must be defined in the superclass.
            // a.speak();
        }

        getAnimal();
        feedAnimal(new Cat());
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
}

class Dog extends Animal {
    void sleep() {
        System.out.println("Sleeping like a dog...");
    }

    void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void sleep() {
        System.out.println("Sleeping like a cat...");
    }

    void speak() {
        System.out.println("Meow!");
    }
}
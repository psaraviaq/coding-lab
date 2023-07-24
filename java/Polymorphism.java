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
            
            //* When calling a method, the compiler will look for the reference type,
            //* Then at runtime, the JVM will look for the object type and match the most specific method.
            a.print(new Dog());
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

    //* When overriding methods, the return type can be also a subclass
    Animal eat() {
        System.out.println("Eating...");
        return new Animal();
    }

    //! If the method is implemented in the subclass but with a subclass parameter,
    //! it will not be overridden but overloaded.
    void print(Animal animal) {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println("Sleeping like a dog...");
    }

    void speak() {
        System.out.println("Woof!");
    }

    //* Overriding method with a subclass return type
    Dog eat() {
        System.out.println("Eating like a dog...");
        return new Dog();
    }

    //! Overloading method with a subclass parameter
    void print(Dog dog) {
        System.out.println("Dog");
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
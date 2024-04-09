package keywords;

public class InstanceOf {

    //* You can use the "instanceof" operator to check if an object is an instance of a class.
    
    public static void main(String[] args) {
        Pet pet = new Rabbit("Bunny");

        //* It works for the class itself and its superclasses.
        System.out.println(pet instanceof Pet);
        System.out.println(pet instanceof Rabbit);

        //* You can automatically cast the object, if it meets the condition, by adding a variable name after the class.
        //! You can use the variable, but only inside the block.
        if (pet instanceof Rabbit rabbit) {
            System.out.println("Hi " + rabbit.name + "!");
        }
        
        //* It also works with switch statements.
        switch (pet) {
            case Rabbit rabbit -> System.out.println(rabbit.name + " is a rabbit!");
            case Fish fish -> System.out.println(fish.name + " is a fish!");
            default -> System.out.println("Hi pet!");
        }
    }
}

class Pet {
    String name;
}

class Rabbit extends Pet {
    public Rabbit(String name) {
        this.name = name;
    }
}

class Fish extends Pet {
    public Fish(String name) {
        this.name = name;
    }
}
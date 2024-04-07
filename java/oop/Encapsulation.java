package oop;

class DogExample {
    String breed;
    private int weight;
    
    //* Use getters to access private variables
    public int getWeight() {
        return weight;
    }
    
    //* Use setters to modify private variables
    public void setWeight(int weight) {
        //* "this" is used to differentiate between the instance variable and the parameter
        this.weight = weight;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        DogExample dog = new DogExample();
        dog.breed = "Labrador";
        System.out.println("Breed: " + dog.breed);
        
        //! Private variables cannot be accessed directly
        // dog.weight = 30;
        //* But they can be accessed through public methods
        dog.setWeight(30);
        System.out.println("Weight: " + dog.getWeight());

        //* If there's no access modifier (default), it's package-private (same level directory)
        //* This means that only classes in the same package can access it (classes, variables, methods, etc.)

        //* Use "protected" to allow subclasses (anywhere) and classes in the same package to access it
    }
}

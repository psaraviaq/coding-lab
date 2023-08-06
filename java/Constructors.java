//* When we create an object, we are calling the constructor.
//* If you don't write a constructor, the compiler will do it anyway.

public class Constructors {

    public static void main(String[] args) {

        //* It runs before the object is assigned to a reference.
        //! This is the only way to call a constructor from outside one.
        Device device = new Device();
        System.out.println(device.price);
    }
}

class Device {
    int price;

    //* A constructor is like a method but without a return type.
    //! It has to have the same name as the class
    public Device() {
        //* It can be used to assign values to instance variables.
        price = 100;
    }

    //* You can still have a method with the same name as the class.
    //! It doesn't make it a constructor, and it's not recommended.
    public void Device() {
    }

    //* This would be the default constructor if you don't write one.
    // public Device() {}
}
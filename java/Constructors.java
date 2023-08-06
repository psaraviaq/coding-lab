//* When we create an object, we are calling the constructor.
//* If you don't write a constructor, the compiler will do it anyway.

public class Constructors {

    public static void main(String[] args) {

        //* The constructor runs before the object is assigned to a reference.
        //! This is the only way to call a constructor from outside one.
        Device device1 = new Device();
        System.out.println(device1.price);

        //* When you create it with specific values, then it will look
        //* for a constructor that matches those parameters.
        Device device2 = new Device(200);
        System.out.println(device2.price);

        //* As seen, you can have multiple constructors in a class.
        Device device3 = new Device("150");
        System.out.println(device3.price);

        //! If you create a constructor, the compiler won't create a default one.
        // Soda soda = new Soda();
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
    //* This would be the default constructor if you don't write one.
    // public Device() {}

    //* If you want specific values, you can use parameters.
    public Device(int devicePrice) {
        price = devicePrice;
    }
    //! Different constructors must have different parameters as well.
    // public Device(int price) {}

    //* Another constructor with different parameters (overloading).
    public Device(String devicePrice) {
        price = Integer.parseInt(devicePrice);
    }

    //* You can still have a method with the same name as the class.
    //! It doesn't make it a constructor, and it's not recommended.
    public void Device() {
    }
}

//! Here, you can't create an object without passing a value.
class Soda {
    String flavor;

    public Soda(String sodaFlavor) {
        flavor = sodaFlavor;
    }
}
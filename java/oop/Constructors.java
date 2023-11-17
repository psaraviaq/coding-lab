package oop;


public class Constructors {
    
    public static void main(String[] args) {
        
        //* The constructor is called whenever an object is created.
        Device device1 = new Device();
        System.out.println(device1.price);
        
        //* You can also pass arguments to the constructor.
        Device device2 = new Device(200);
        System.out.println(device2.price);
        
        //! Here, you can't create an object with no arguments.
        // Soda soda = new Soda();
    }
}

class Device {
    int price;
    
    //* A constructor is like a method but without a return type.
    //! It has to have the same name as the class
    public Device() {
        //* It can be used to initialize the state of an object.
        price = 100;
    }
    
    //* You can also overload constructors to specify different ways to create an object.
    public Device(int devicePrice) {
        price = devicePrice;
    }
    
    //! The compiler will create a default constructor if you don't create any.
    // public Device() {}
    
    //* You can still have a method with the same name as the class, but it's not a constructor.
    // public void Device() {}
}

class Soda {
    String flavor;
    
    //! If you create a constructor, the compiler won't create a default one.
    public Soda(String sodaFlavor) {
        flavor = sodaFlavor;
    }
}
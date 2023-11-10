package keywords;

public class Static {
    public static void main(String[] args) {
        //* Static fields and methods can be accessed by just using the class name
        System.out.println(Calculator.add(3, 4));
        System.out.println(Calculator.calculatorCount);
        
        Calculator c1 = new Calculator("Casio");
        Calculator c2 = new Calculator("Wolfram");
        
        System.out.println(Calculator.calculatorCount);
    }
}

class Calculator {
    String model;
    
    //* "static" is used to declare a field or method as belonging to the class, not to an instance of the class
    static int calculatorCount = 0;
    
    static int add(int a, int b) {
        //! Static methods can't access instance fields and methods
        // System.out.println(model);
        
        return a + b;
    }
    
    //? But if you don't want the class to be instantiated, you can make the constructor "private"
    public Calculator(String name) {
        
        //* This field is incremented for every new Student instance created
        calculatorCount++;
        
        model = name;
    }
}
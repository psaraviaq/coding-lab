package oop;

public class Generics {

    //* Generics are used to create classes that can work with any data type
    //* You can use multiple types, and even use "extends" (for classes and interfaces)
    public static void main(String[] args) {

        //* Classes and interfaces
        Generic<String> words = new Generic<>();

        //* Methods
        Method.add(1);
        
        //* Argument
        Method.get(words);
    }
}

//* With classes and interfaces, put the type parameter after the class name
class Generic<T> {
    
    //* Which can be used anywhere inside the class
    private T value;

    public T getValue() {
        return value;
    }
}

//* With methods, put the type parameter before the return type
class Method {

    //* Which can be used in the return type, parameters, and body
    static public <T extends Number> void add(T number) {
    }

    //* There's also a generic wildcard, represented by "?" (there can be multiple)
    //! It is used as a type argument, not a type parameter
    static public void get(Generic<?> generics) {
    }
}

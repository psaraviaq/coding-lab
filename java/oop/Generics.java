package oop;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //* Generics are used to create classes that can work with any data type
    //* You can use multiple types, and even use "extends" (for classes and interfaces)
    public static void main(String[] args) {

        //* Classes and interfaces
        Generic<String> word = new Generic<>();

        //* Methods
        Method.global(new ArrayList<Integer>());

        //* You can only pass the type parameter defined in the method when it's specific
        Method.specific(new Generic<Object>());
        //! You can't pass a subclass of a specific type parameter
        // Method.specific(new Generic<String>());
        //* But you can omit the type parameter and the compiler will infer it
        Method.specific(new Generic<>());
        
        //* Type Argument
        Method.wildcard(word);
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
    static public <T extends Number> void global(List<T> numbers) {
    }

    //! With specific type parameters, you can't pass subclasses of it in the class when calling the method
    static void specific(Generic<Object> generic) {
    }

    //* There's also a generic wildcard, represented by "?" (there can be multiple)
    //! It is used as a type argument, not a type parameter
    static public void wildcard(Generic<?> generic) {
    }
}

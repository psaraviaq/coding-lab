package miscellaneous;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Lambdas {
    
    public static void main(String[] args) {

        //* Lambda expressions are implementations of interfaces with a single abstract method
        //! So a lambda expressions is an object too, its type is the interface it implements
        Consumer<String> consumer = s -> System.out.println(s);

        //* Because they are treated as instances, you can pass them as arguments
        List<String> vowels = List.of("a", "e", "i", "o", "u");
        vowels.forEach(consumer);
        //* "forEach" is a minified version of a for loop.
        // vowels.forEach(s -> System.out.println(s));

        //* Method references are a shorthand for lambda expressions when they're just a method call
        //* First, you put the class name, then instead of ".", you put "::", and then the method name
        List<String> VOWELS = vowels.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(VOWELS);
    }
}

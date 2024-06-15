package miscellaneous;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Lambdas {
    
    public static void main(String[] args) {

        //* Lambda expressions are implementations of interfaces with a single abstract method
        //! A lambda expression is an object too, its type is the interface it implements
        Consumer<String> consumer = s -> System.out.println(s);

        //* Because they are treated as instances, you can pass them as arguments
        List<String> vowels = List.of("a", "e", "i", "o", "u");
        vowels.forEach(consumer);
        //* "forEach" is a minified version of a for loop.
        // vowels.forEach(s -> System.out.println(s));

        //* Lambdas can have more than one line of code
        Function<String, String> toUpperCase = s -> {
            System.out.println("Converting to uppercase...");
            return s.toUpperCase();
        };

        //* Method references are a shorthand for lambda expressions when they're just a method call
        //* First, you put the class name, then instead of ".", you put "::", and then the method name
        // Consumer<String> consumer = System.out::println;
        List<String> VOWELS = vowels.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(VOWELS);
    }
}

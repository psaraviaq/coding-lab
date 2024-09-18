package miscellaneous;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    
    public static void main(String[] args) {

        //* The Streams API is a group of operations that can be performed on a collection of data
        //! Some streams don't return a collection, they're just instructions 
        List<String> vowels = List.of("a", "e", "i", "o", "u");

        //* You first need a "Stream" object, use the "stream" method on a collection
        Stream<String> stream = vowels.stream();

        //* Then you can perform operations on the stream, "limit" is one of them
        //! Streams can't be reused, you must create a new stream for each operation
        Stream<String> limit = stream.limit(3);

        //* If you want to put the result of the stream into a collection, use "collect" and specify a collector
        List<String> newVowels = limit.collect(Collectors.toList());
        System.out.println("limit(3): " + newVowels);

        //* You can also chain the operations together
        //! When performing operations on a stream, the original collection is not altered
        // List<String> moreVowels = vowels.stream().limit(3).collect(Collectors.toList());

        //* "count" returns the number of elements in the stream
        long count = vowels.stream().count();
        System.out.println("count(): " + count);

        //* "sorted" returns a sorted stream, and it can take a comparator
        List<String> sorted = vowels.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println("sorted(): " + sorted);

        //* "skip" ignores the first n elements of the stream
        List<String> skip = vowels.stream().skip(2).collect(Collectors.toList());
        System.out.println("skip(2): " + skip);

        //* "filter" returns only the elements that match the predicate
        List<String> filter = vowels.stream().filter(s -> s == "a" || s == "o").collect(Collectors.toList());
        System.out.println("filter(): " + filter);

        //* "map" replaces each element with the result of the function, which can be any type
        List<String> map = vowels.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("map(): " + map);

        //* "distinct" returns a stream with only the unique elements
        //! But instead of using "distinct", you can also use "toSet", or even unmodifiable collections
        List<String> distinct = vowels.stream().distinct().collect(Collectors.toList());
        // Set<String> distinct = vowels.stream().collect(Collectors.toSet());
        System.out.println("distinct(): " + distinct);

        //* "Collectors.joining" returns a string with all the elements of the stream, and it can take a delimiter
        //* The method calls "toString" on each element when joining
        String joined = vowels.stream().collect(Collectors.joining());
        System.out.println("Collectors.joining(): " + joined);

        //* "anyMatch" returns true if any element matches the predicate
        boolean anyMatch = vowels.stream().anyMatch(s -> s.equals("a"));
        System.out.println("anyMatch(): " + anyMatch);

        //* "findFirst" returns the first element of the stream
        String first = vowels.stream().findFirst().get();
        System.out.println("findFirst(): " + first);
    }
}

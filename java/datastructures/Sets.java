package datastructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    //* Sets have unique elements, and they are not ordered.
    //! For elements to be unique, they must implement "hashCode" and "equals"

    public static void main(String[] args) {
        //* "HashSet" is the most common implementation of a set
        Set<String> words = new HashSet<>();
        words.add("Peter");
        words.add("Jessica");
        words.add("Peter");
        System.out.println(words);

        //* You can also create a set by passing a list to the constructor
        // Set<String> moreWords = new HashSet<>(new ArrayList<>());

        //* Use "TreeSet" to sort the elements while still having unique elements
        //! However, either the elements must implement "Comparable"
        //! Or you must pass a "Comparator" instance or a lambda to the constructor 
        Set<Unique> uniqueSet = new TreeSet<>((u1, u2) -> u1.title.compareTo(u2.title));
        uniqueSet.add(new Unique("orange"));
        uniqueSet.add(new Unique("mango"));
        uniqueSet.add(new Unique("apple"));
        uniqueSet.add(new Unique("mango"));
        System.out.println(uniqueSet);
    }
}

class Unique {
    String title;

    public Unique(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    //* For "hashCode", you could simply use the one from the "String" class
    @Override
    public int hashCode() {
        return title.hashCode();
    }

    //! The "equals" method must use "Object" as the parameter type in order to override it
    @Override
    public boolean equals(Object object) {
        //* You can just cast the object back to the class you want to compare
        Unique m = (Unique) object;
        //* And then again, take advantage of the "String" class
        return title.equals(m.title);
    }
}

package datastructures;

//* Lists are collections that are more flexible than arrays

//* You have to import them from "java.util"
import java.util.ArrayList;
import java.util.List;

public class Lists {
    
    public static void main(String[] args) {

        //* To initialize it, write "List", specify the type of elements inside <>, and then its name
        //* Then type "new", write "ArrayList", specify the same type of elements inside <> again, and then ()
        // List<String> names = new ArrayList<String>();
        //* They don't have a fixed size, so you don't have to specify it
        //* You can omit the second type if you're using Java 7 or later
        List<String> names = new ArrayList<>();
        
        //! ArrayLists can't store primitive types, you have to use their wrapper classes
        // ArrayList<int> numbers = new ArrayList<>();             BAD
        // ArrayList<Integer> numbers = new ArrayList<>();         GOOD
        
        //* To add elements, use the "add" method
        names.add("Jack");
        System.out.println("add(Jack): [] --> " + names);
        names.add("Jill");
        names.add("Peter");
        
        //* To access elements, use the "get" method
        System.out.println("get(0): " + names.get(0));
        //* When printing a list, each element will call its "toString" method
        System.out.println("names: " + names);
        
        //* To get the number of elements, use the "size" method instead of "length"
        System.out.println("size(): " + names.size());
        
        //* To remove elements, use the "remove" method and specify the index
        names.remove(2);
        System.out.println("remove(2): [Jack, Jill, Peter] --> " + names);
        //! Printing a non-existent element will cause an error
        // System.out.println(names.get(2));
        
        //* You can also remove elements by specifying the element itself
        //! But it will only remove the first occurrence of the element
        names.add("Jill");
        names.remove("Jill");
        System.out.println("remove(Jill): [Jack, Jill, Jill] --> " + names);
        
        //* To check if an element exists, use the "contains" method
        System.out.println("contains(Jack): " + names.contains("Jack") + ", contains(Jackie): " + names.contains("Jackie"));
        
        //* To return the index of an element, use the "indexOf" method
        //! If the element doesn't exist, it will return -1
        System.out.println("indexOf(Jill): " + names.indexOf("Jill") + ", indexOf(Peter): " + names.indexOf("Peter"));
        
        //* To check if an ArrayList is empty, use the "isEmpty" method
        System.out.println("isEmpty(): " + names.isEmpty());
    }
}

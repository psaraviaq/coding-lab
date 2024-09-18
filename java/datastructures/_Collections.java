package datastructures;

import java.util.*;

@SuppressWarnings("unused")
public class _Collections {
    public static void main(String[] args) {
        
        //* We can use the "of" static methods from List and Set to create straight away an unmodifiable collection
        //! Their subtypes can't use this method though (ArrayList, HashSet, etc.)
        List<String> fruits = List.of("apple","orange","mango");

        //* Maps also have the "of" method but it only accepts up to 10 entries
        Map<String, String> map = Map.of("key1","value1","key2","value2", "key3","value3");
        //* You can however use the "ofEntries" method to create maps with more than 10 entries, each pair goes into a "Map.entry"
        Map<String, String> map2 = Map.ofEntries(Map.entry("key1","value1"), Map.entry("key2","value2"));
        
        
        //* You can also make a collection unmodifiable by using those methods from "Collections"
        List<String> cars = Collections.unmodifiableList(new ArrayList<>());
        // cars.add("toyota");
    }
    
    //! When using generics with collections in method parameters, you can only use the type parameter in the method body
    static public <T extends Object> void method_1(List<T> animals) {
        //* Therefore, you can only add elements of type T, which is defined at runtime
        // animals.add("chicken");
    }
    
    //* But with "?", you will never be able to add anything to the collection because the type can't be used elsewhere
    static public void method_2(Set<? extends Object> animals) {
        // animals.add("cow");
    }
}

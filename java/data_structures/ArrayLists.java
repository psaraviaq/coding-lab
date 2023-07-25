import java.util.ArrayList;

//* With ArrayLists, you don't need to specify the size
//* You have to import it from the "java.util.ArrayList" class
public class ArrayLists {
    //* As an instance variable, it's initialized to null as well
    static ArrayList<String> fruits;

    public static void main(String[] args) {
        System.out.println(fruits);

        //* To initialize it, write "ArrayList", specify the type of elements in <>, and then its name
        //* Then type "new", write "ArrayList" again, specify the same type of elements in <> again, and then ()
        ArrayList<String> names = new ArrayList<String>();
        //! You can't use ArrayLists with basic primitive types
        // ArrayList<int> nums = new ArrayList<int>();
        //* To add elements, use the "add" method
        names.add("Jack");
        names.add("Jill");

        //* To access elements, use the "get" method
        System.out.println(names.get(0) + " and " + names.get(1));

        //* To get the size, use the "size" method
        System.out.println(names.size());

        //* To remove elements, use the "remove" method
        names.add("Peter");
        System.out.println(names.get(2));
        names.remove(2);
        //! Printing a non-existent element will cause an error
        // System.out.println(names.get(2));
        //* You can also remove elements by specifying the element itself
        //* It will only remove the first occurrence of the element though
        names.add("Rose");
        System.out.println(names.get(2));
        names.remove("Rose");

        //* To check if an element exists, use the "contains" method
        System.out.println(names.contains("Rose"));
        System.out.println(names.contains("Jack"));

        //* To return the index of an element, use the "indexOf" method
        System.out.println(names.indexOf("Jill"));
        //! If the element doesn't exist, it will return -1
        System.out.println(names.indexOf("Peter"));

        //* To check if an ArrayList is empty, use the "isEmpty" method
        System.out.println(names.isEmpty());
    }
}

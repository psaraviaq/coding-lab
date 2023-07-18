import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        //* With ArrayLists, you don't need to specify the size
        //* To initialize it, write "ArrayList", specify the type of elements in <>, and then its name
        //* Then type "new", write "ArrayList" again, specify the same type of elements in <> again, and then ()
        ArrayList<String> names = new ArrayList<String>();

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
        names.remove("Peter");
        //! Printing a non-existent element will cause an error
        // System.out.println(names.get(2));
    }
}

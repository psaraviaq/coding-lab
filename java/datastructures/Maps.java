package datastructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    //* WHile maps don't implement the "Collection" interface, they are still considered one 

    public static void main(String[] args) {
        //* Maps use two generic types, one for the key and the other for the value
        //! Keys must be unique, but values can be repeated
        Map<String, Integer> scores = new HashMap<>();

        //* We use "put" instead of "add" in maps, and you pass both the key and the value as arguments
        scores.put("math", 9);
        scores.put("english", 10);
        scores.put("science",5);

        //* When you print a map, it will print a "key=value" pair, and will use "{}" instead of "[]"
        System.out.println(scores);

        //* You can access the value of a key by using "get" and passing it as an argument
        System.out.println(scores.get("math"));
    }
}

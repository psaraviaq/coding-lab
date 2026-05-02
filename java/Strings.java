public class Strings {

    //* Strings are objects in java
    //! They are immutable, they can't be changed with any method

    public static void main(String[] args) {
        //* The "String" class overrides the "toString" method of the "Object" class
        //* So it prints the content of the string instead of the reference
        System.out.println("Hello World!");

        //* Methods
        length();
        equals(); // equalsIgnoreCase
        repeat();
        toLowerCase();
        toUpperCase();
        indexOf();
        trim();
        split();
        charAt();
    }

    static void length() {
        //! length is a method for strings in java
        String str = "Hello World!";
        System.out.println("\"Hello World!\" --> " + "length(): " + str.length());
    }

    static void equals() {
        //* For comparing the content of two strings
        //! In java, you can't use == to compare two strings
        String str1 = "peter";
        String str2 = "Peter";
        System.out.println("\"Peter\".equals(\"Peter\"): " + str2.equals("Peter"));
        //* You can use "equalsIgnoreCase" to ignore the case
        System.out.println("\"peter\".equalsIgnoreCase(\"Peter\"): " + str1.equalsIgnoreCase("Peter"));
    }

    static void repeat() {
        //* For repeating a string a specific number of times
        String str = "Hello";
        System.out.println("\"Hello \" --> " + "repeat(3): " + str.repeat(3));
    }

    static void toLowerCase() {
        //* For converting a string to lowercase
        String str = "Peter";
        System.out.println("\"Peter\" --> " + "toLowerCase(): " + str.toLowerCase());
    }

    static void toUpperCase() {
        //* For converting a string to uppercase
        String str = "Peter";
        System.out.println("\"Peter\" --> " + "toUpperCase(): " + str.toUpperCase());
    }

    static void indexOf() {
        //* For finding the index of the first occurrence of a string
        //* Or returns -1 if the string is not found
        String str = "Hello World!";
        System.out.println("\"Hello World!\" --> " + "indexOf(\"World\"): " + str.indexOf("World"));
    }

    static void trim() {
        //* For removing white-spaces from the beginning and the end of a string
        String str = "   Hello World!   ";
        System.out.println("\"   Hello World!   \" --> " + "trim(): " + str.trim());
    }

    static void split() {
        //* For splitting a string into an array of strings
        String str = "Hello, World!";
        //! The method returns an array of strings
        String[] arr = str.split(", ");
        System.out.println("\"Hello, World!\" --> " + "split(\", \"): [\"" + arr[0] + "\", \"" + arr[1] + "\"]");
    }

    static void charAt() {
        //* For reading a character at a specific index
        //! In java, you can't use [] to read a character
        String str = "Peter";
        System.out.println("\"Peter\" --> " + "charAt(2): " + str.charAt(2));
    }
}

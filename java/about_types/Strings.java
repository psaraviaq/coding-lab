public class Strings {

    //* Strings are objects in java
    //! They are immutable, they can't be changed with any method

    public static void main(String[] args) {
        length();
        charAt();
        equals();
        format();
        toLowerCase();
        toUpperCase();
        trim();
        indexOf();
    }

    static void length() {
        //! length is a method for strings in java
        String str = "Hello World!";
        System.out.println(str.length());
    }

    static void charAt() {
        //* For reading a character at a specific index
        //! In java, you can't use [] to read a character
        String str = "Peter";
        System.out.println(str.charAt(2));
    }

    static void equals() {
        //* For comparing the content of two strings
        //! In java, you can't use == to compare two strings
        String str1 = "peter";
        String str2 = "Peter";
        System.out.println(str1.equals("Peter"));
        System.out.println(str2.equals("Peter"));
    }

    static void format() {
        //* For joining strings with other types
        String str = "Peter";
        int age = 22;
        /*
         * %s is a placeholder for strings
         * %d is a placeholder for integers
         * %f is a placeholder for floating point numbers
         * %b is a placeholder for booleans
         * %c is a placeholder for characters
         *
         */
        String message = String.format(
                "Hello, my name is %s and I am %d years old and %.2f meters tall",
                str, age, 1.75
        );
        System.out.println(message);
    }

    static void toLowerCase() {
        //* For converting a string to lowercase
        String str = "Peter";
        System.out.println(str.toLowerCase());
    }

    static void toUpperCase() {
        //* For converting a string to uppercase
        String str = "Peter";
        System.out.println(str.toUpperCase());
    }

    static void trim() {
        //* For removing whitespaces from the beginning and the end of a string
        String str = "   Hello World!   ";
        System.out.println(str.trim());
    }

    static void indexOf() {
        //* For finding the index of the first occurrence of a string
        //* Or returns -1 if the string is not found
        String str = "Hello World!";
        System.out.println(str.indexOf("World"));
    }
}

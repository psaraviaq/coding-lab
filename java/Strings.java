public class Strings {
    
    //* Strings are objects in java
    //! They are immutable, they can't be changed with any method
    
    public static void main(String[] args) {
        length();
        charAt();
        equals();
        toLowerCase();
        toUpperCase();
        trim();
        indexOf();
    }
    
    static void length() {
        //! length is a method for strings in java
        String str = "Hello World!";
        System.out.println("\"Hello World!\" --> " + "length(): " + str.length());
    }
    
    static void charAt() {
        //* For reading a character at a specific index
        //! In java, you can't use [] to read a character
        String str = "Peter";
        System.out.println("\"Peter\" --> " + "charAt(2): " + str.charAt(2));
    }
    
    static void equals() {
        //* For comparing the content of two strings
        //! In java, you can't use == to compare two strings
        String str1 = "peter";
        String str2 = "Peter";
        System.out.println("\"peter\".equals(\"Peter\"): " + str1.equals("Peter"));
        System.out.println("\"Peter\".equals(\"Peter\"): " + str2.equals("Peter"));
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
    
    static void trim() {
        //* For removing whitespaces from the beginning and the end of a string
        String str = "   Hello World!   ";
        System.out.println("\"   Hello World!   \" --> " + "trim(): " + str.trim());
    }
    
    static void indexOf() {
        //* For finding the index of the first occurrence of a string
        //* Or returns -1 if the string is not found
        String str = "Hello World!";
        System.out.println("\"Hello World!\" --> " + "indexOf(\"World\"): " + str.indexOf("World"));
    }
}

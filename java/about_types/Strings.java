public class Strings {

    //* Strings are objects in java

    public static void main(String[] args) {
        length();
        charAt();
        equals();
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
}

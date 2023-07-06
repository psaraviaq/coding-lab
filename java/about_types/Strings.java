public class Strings {
    public static void main(String[] args) {
        length();
        charAt();
    }

    static void length() {
        //! length is a method in java
        String str = "Hello World!";
        System.out.println(str.length());
    }

    static void charAt() {
        //* For reading a character at a specific index
        //! In java, you can't use [] to read a character
        String str = "Peter";
        System.out.println(str.charAt(2));
    }
}

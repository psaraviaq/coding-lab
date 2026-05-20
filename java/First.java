//! The class name must be the same as the filename
public class First {

    //* The "main" method is the entry point of the program
    public static void main(String[] args) {

        //* "print" doesn't add a new line at the end
        System.out.print("Oi. ");

        //* But "println" does, so it's the most common one
        System.out.println("Hello, World!");

        //! You can only use one argument when printing
        // System.out.println("I'm", "Peter");
        //* But you can concatenate them
        System.out.println("I'm" + " Peter");

        //~ "printf" is for formatted output, and can take multiple arguments
        System.out.printf("%s\t%s\n", "Name:", "Pedro");
    }

}

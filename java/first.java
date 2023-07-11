// * Basic Example

// * "public": it can be accessed from anywhere,
// * not required when working in the same package
// * The name must match the filename (compiler rules)
public class first {

    // * "public" is required here
    // * "static": doesn't need to create an instance to run
    // * "void": the method doesn't need to return anything
    // * "String[]" is required, but "args" can be any other name
    public static void main(String[] args) {

        //* "print" doesn't add a new line
        System.out.print("Oi. ");
        //* But "println" does, so it's the most common
        System.out.println("Hello, World!");

        //! You can only use one argument when printing
        // System.out.println("I'm", "Peter");
        //* But you can concatenate them
        System.out.println("I'm" + " Peter");
    }

}

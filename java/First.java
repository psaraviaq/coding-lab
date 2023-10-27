//! The class name must be the same as the file name
public class First {
    
    //* The "main" method is the entry point of the program, and it must have the signature:
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

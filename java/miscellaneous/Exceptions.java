package miscellaneous;
import javax.sound.midi.*;

@SuppressWarnings("unused")
public class Exceptions {

    //* Exceptions are objects that represent an error or an unexpected situation
    //* They are thrown by methods that can't guarantee success

    public static void main(String[] args) {
        Exceptions midi = new Exceptions();
        System.out.println(midi.play());

        //* This doesn't need a "try/catch" because is a runtime exception
        // Integer.parseInt("null");
    }

    public int play() {
        //* Use a "try/catch" block to encapsulate and deal with exceptions
        //! But not for flaws in your code that you can fix, only for things you can't control
        //* All exceptions must be caught, except for runtime exceptions which are optional
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Success");
            // throw new Exception();

            // var x = 4/0;
            // Integer.parseInt("hello");
            
            return 0;
            //* You can have multiple "catch" blocks for different types of exceptions
            //! Exceptions are polymorphic too, so you can declare a superclass and catch subclasses
            //! But you can't declare a superclass, and then a subclass, because the subclass will never be reached, and it will give a compilation error
            
            //* You can also use multi-catch to catch multiple exceptions in the same block
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("One of the two exceptions happened: " + e.getClass());
            return 3;
        } catch (Exception e) {
            System.out.println(":(");
            //* "printStackTrace" prints the exception and also where it happened
            e.printStackTrace();
            return 1;
        //* You can optionally use "finally" to run code after the block, even if it already returned something
        } finally {
            System.out.println("!");
            //! However, if you return something here, it will override the return value in "try/catch"
            // return 2;
        }
    }

    //! If a method might throw an exception, you must declare it in the method signature
    //* Use the "throws" keyword with the exception class (use commas to add more exceptions)
    //* You can also declare a superclass and throw subclasses
    public void myMethod() throws Exception {
        if (true) {
            //* Here you use the "throw" keyword to throw an exception
            //! Because exceptions are objects too, you have to create them with "new"
            throw new Exception();
            //! It is pointless to throw a runtime exception, since they mean bad code
            // throw new NullPointerException();
        }
    }

    //* You can duck exceptions by declaring again the exception in the method that calls the method that throws
    public void duckException() throws MidiUnavailableException {
        Sequencer sequencer = MidiSystem.getSequencer();
    }
}

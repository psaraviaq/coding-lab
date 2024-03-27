package miscellaneous;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;

@SuppressWarnings("unused")
public class Exceptions {

    //* Exceptions are objects that represent an error or unexpected situation
    //* They are thrown by methods that can't guarantee success

    public static void main(String[] args) {
        Exceptions midi = new Exceptions();
        System.out.println(midi.play());

        //* this don't need try/catch because runtimeException
        // Integer.parseInt("null");
    }

    //* if call method that might throw (NOT or directly throw yourself NOT) (throw a not runtimeException). u must acknowledge, one way is wrap it with try/catch
    //* if called method throw a runtime, then try/catch not needed
    public int play() {
        //* try/catch for unexpected situations (that can't guarantee success), not for flaws in code
        //* You can optionally use "finally" to run code after try/catch, even if it returns something
        //* You can have multiple catch blocks for different exceptions
        //! Exceptions are polymorphic, so you can catch a superclass for its subclasses
        //! But you can't catch a superclass and then a subclass, because it will never reach the subclass, and it won't compile either
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Success");
            // throw new Exception();
            return 0;
        } catch (Exception e) {
            System.out.println(":(");
            //* "printStackTrace" prints the exception and where it happened
            e.printStackTrace();
            return 1;
        } finally {
            System.out.println("!");
            //! However, if you return in finally, it will override the return in either try or catch
            // return 2;
        }
    }

    //* if method might throw exception, declare in the method, use "throws" keyword with the exception class (or more separated by comma)
    //* also you can declare superclass and throw subclasses
    public void myMethod() throws Exception {
        if (true) {
            //? you don't have to declare runtime either, but good practice?
            // throw new NullPointerException();
            //* exceptions too objects, use "throw" keyword and new exception object
            throw new Exception();
        }
    }

    //* you can also duck exception by declaring again the exception thrown by method (even main)
}

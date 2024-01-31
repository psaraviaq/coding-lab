package miscellaneous;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;

//* EXCEPTIONS

public class Exceptions {

    //* Methods can throw exceptions

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

    //* if method might throw exception, declare in the method, use "throws" keyword with the exception class
    public void myMethod() throws Exception {
        if (true) {
            //? you don't have to declare runtime either, but good practice?
            // throw new NullPointerException();
            //* exceptions too objects, use "throw" keyword and new exception object
            throw new Exception();
        }
    }
}

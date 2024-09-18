package miscellaneous;

import java.io.BufferedWriter;
//* Import the "NIO" library
import java.nio.file.*;

public class _File_II {
    public static void main(String[] args) {
        //* The "NIO" library is a more modern way to handle files
        Path file = Paths.get("nio_example.txt");
        //* You can even create directories with it and move files around
        //* ...

        // try {
            //* You can still use the buffer class to write to the file
            // BufferedWriter bw = Files.newBufferedWriter(file);
            // bw.write("NIO package");
            // bw.close();
        // } catch (Exception e) {
        // }

        //! But if one of methods fails, the file won't be closed
        //* You can handle it with a "finally" block
        //! You would need to declare the BufferedWriter outside the try block to access it in the finally block
        // BufferedWriter bw = null;
        // try {
            // bw = Files.newBufferedWriter(file);
            // bw.write("NIO package");
        // } catch (Exception e) {
        // } finally {
            //! And now you have to wrap the "close" method in a try-catch block
            // try {
                // bw.close();
            // } catch (Exception e) {
                // e.printStackTrace();
            // }
        // }

        //* To make it more efficient, use a "try-with-resources" block
        //! The argument inside the parentheses must implement the "AutoCloseable" interface
        //* It will automatically close the resource after the block ends or an exception is thrown
        try (BufferedWriter bw = Files.newBufferedWriter(file)) {
            bw.write("NIO package");
        } catch (Exception e) {
        }

        //* You can even declare more than one resource in the same block
        //* And they must be separated by a semicolon
        //! But they will be closed in the reverse order they were declared
        // try (BufferedWriter bw = Files.newBufferedWriter(file);
            //  BufferedWriter bw2 = Files.newBufferedWriter(file)) {
            // bw.write("NIO package");
            // bw2.write("NIO package");
        // } catch (Exception e) {
        // }
    }
}

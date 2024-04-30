package miscellaneous;

import java.io.*;

public class _File {

    public static void main(String[] args) {
        try {
            //* The "File" class is a more versatile way to create files
            //* You can also create directories with it, delete files, etc.
            File file = new File("file_example.txt");
            //* You can even provide a path as an argument instead of just the file name
            // File example = new File("./miscellaneous/example.txt");

            //! But the file object doesn't represent the data inside the file
            //* To actually write to the file, you need to use a "FileWriter"
            FileWriter fw = new FileWriter(file);
            // fw.write("Hello, world!\nI'm a file!");
            // fw.close();

            //! But writing constantly to the file can cause performance issues
            //* To make it more efficient, you can use a "BufferedWriter" which writes to the file in chunks
            BufferedWriter bw = new BufferedWriter(fw);
            //* You can still use the "write" and "close" methods
            bw.write("Hello, world!");
            //*! And you now have access to the "newLine" method, which is more easy to use than "\n"
            bw.newLine();

            bw.write("I'm a file!");
            bw.newLine();
            bw.write("Nice to meet you!");
            bw.close();

            //* You can also pass the classes directly to their constructors
            // BufferedWriter writer = new BufferedWriter(new FileWriter(new File("example.txt")));
        } catch (Exception e) {
        }

        try {
            //* To read a file, you follow a similar process
            File file = new File("file_example.txt");
            //* You can use a "FileReader" to read the file
            FileReader fr = new FileReader(file);
            //* And a "BufferedReader" to read it in chunks
            BufferedReader br = new BufferedReader(fr);

            //* You can read the file line by line with the "readLine" method
            String line = br.readLine();
            //! The method returns "null" when there are no more lines to read
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
        } catch (Exception e) {
        }
    }
}

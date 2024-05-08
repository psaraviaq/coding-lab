package miscellaneous;

import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.nio.charset.StandardCharsets;

public class Channels_Server {
    public static void main(String[] args) {
        try {
            ServerSocketChannel serverChannel = ServerSocketChannel.open();

            //! The "bind" method starts the server on the specified address object.
            //* The address uses the port number as the only argument.
            serverChannel.bind(new InetSocketAddress(5000));

            while (serverChannel.isOpen()) {
                System.out.println("Waiting...");

                //* Create the connection object when a client connects.
                SocketChannel socketChannel = serverChannel.accept();

                System.out.println("Connected!");

                //* We have to use the "Channels" class again to communicate.
                //! But now we use the "newWriter" method to create a "Writer" object.
                //* The charsets for reading and writing should be the same.
                Writer writer = Channels.newWriter(socketChannel, StandardCharsets.UTF_8);

                //* We could wrap it in a "BufferedWriter"
                // BufferedWriter bw = new BufferedWriter(writer);
                //! But it is more common to use the "PrintWriter" class.
                PrintWriter pw = new PrintWriter(writer);

                //! And now you use other methods like "print" and "println".
                pw.println("Hello");

                //* Don't forget to close them again.
                pw.close();
                socketChannel.close();
            }
            serverChannel.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

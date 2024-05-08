package miscellaneous;

import java.io.BufferedReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class Channels_Client {
    public static void main(String[] args) {
        //! The "InetSocketAddress" creates an address object.
        //* We pass the IP address (or even "localhost") and the port number of the server we want to connect to.
        InetSocketAddress serverAddress = new InetSocketAddress("localhost", 5000);

        try {
            //! The "SocketChannel" object represents a network connection between two machines.
            //* Pass the address object to the "open" method to create the connection object.
            SocketChannel socketChannel = SocketChannel.open(serverAddress);

            //! To communicate with the server, we can use the "Channels" class.
            //* The "newReader" method creates a "Reader" object that reads from the server.
            //* Pass the connection object and the "UTF_8" charset as arguments.
            Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);

            //* To make the reading easier, wrap it in a "BufferedReader".
            BufferedReader br = new BufferedReader(reader);

            //* And you can use the same methods as with a file to read the data.
            String line = br.readLine();

            System.out.println(line);

            //! Don't forget to close the connections.
            br.close();
            socketChannel.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //* You could also write messages to the server.
        /* try (SocketChannel socketChannel = SocketChannel.open(serverAddress);
        PrintWriter writer = new PrintWriter(Channels.newWriter(socketChannel, StandardCharsets.UTF_8))) {
            writer.println("Hello back!");
        } catch (Exception e) {
            e.printStackTrace();
        } */
    }
}

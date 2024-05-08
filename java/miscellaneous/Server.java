package miscellaneous;

import java.io.*;
import java.net.*;
import java.nio.channels.*;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) {
        try {
            //! On the server side, we have to create a "ServerSocketChannel" object with the "open" method.
            //* The method here doesn't take any arguments.
            ServerSocketChannel serverChannel = ServerSocketChannel.open();

            //! Use the "bind" method to start the server on the specified address object.
            //* The address uses the port number as the only argument.
            serverChannel.bind(new InetSocketAddress(5000));

            //! Use the "isOpen" method of the server object to check if it's still running.
            //* Use a loop to keep listening for a new client when the old one disconnects.
            while (serverChannel.isOpen()) {
                System.out.println("Waiting...");

                //! Now you create the connection object with the "accept" method of the server object.
                //* The method blocks the program until a client connects and returns the connection object.
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
        } catch (IOException e) {
            e.printStackTrace();
        }

        //* You could also read messages from a client.
        /* try (ServerSocketChannel serverChannel = ServerSocketChannel.open().bind(new InetSocketAddress(5000))) {
            while (serverChannel.isOpen()) {
                System.out.println("Waiting...");
                try (SocketChannel socketChannel = serverChannel.accept();
                BufferedReader br = new BufferedReader(Channels.newReader(socketChannel, StandardCharsets.UTF_8))) {
                    String line = br.readLine();
                    System.out.println(line);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } */
    }

    //* You could also just use sockets here too.
    public static void _main(String[] args) {
        try {
            //! "ServerSocket" directly starts the server on the specified port number as an argument.
            ServerSocket serverSocket = new ServerSocket(5000);
            
            //! Use the "isClosed" method to check if the server is still running.
            while (!serverSocket.isClosed()) {
                System.out.println("Waiting...");

                //! Calling the "accept" method of the server object creates the connection object.
                Socket socket = serverSocket.accept();

                System.out.println("Connected!");

                //! Create a "PrintWriter" object by passing the "getOutputStream" method of the socket.
                PrintWriter pw = new PrintWriter(socket.getOutputStream());
                
                //* And the rest of the code is the same.
                pw.println("Hello!");

                pw.close();
                socket.close();
            }
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

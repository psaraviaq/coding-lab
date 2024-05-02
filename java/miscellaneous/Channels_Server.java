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
            serverChannel.bind(new InetSocketAddress(5000));

            while (serverChannel.isOpen()) {
                System.out.println("Waiting...");
                SocketChannel clientChannel = serverChannel.accept();

                Writer w = Channels.newWriter(clientChannel, StandardCharsets.UTF_8);
                PrintWriter writer = new PrintWriter(w);
                
                writer.println("Hello!");

                writer.close();
            }
        } catch (Exception e) {
        }
    }
}

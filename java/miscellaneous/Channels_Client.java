package miscellaneous;

import java.io.BufferedReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class Channels_Client {
    public static void main(String[] args) {
        InetSocketAddress serverAddress = new InetSocketAddress("localhost", 5000);

        try {
            SocketChannel socketChannel = SocketChannel.open(serverAddress);

            Reader r = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
            
            BufferedReader reader = new BufferedReader(r);
            
            String line = reader.readLine();

            System.out.println(line);
        } catch (Exception e) {
            System.out.println(":(");
        }
    }
}

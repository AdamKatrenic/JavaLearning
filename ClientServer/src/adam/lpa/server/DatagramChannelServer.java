package adam.lpa.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class DatagramChannelServer {

     private static final int PORT = 5000;
     private static final int PACKET_SIZE = 1024;

    public static void main(String[] args) {

        try (DatagramChannel channel = DatagramChannel.open()){

            channel.bind(new InetSocketAddress(PORT));
            System.out.println("Server listening on port " + PORT);

            Selector selector = Selector.open();
            channel.configureBlocking(false);
            channel.register(selector, SelectionKey.OP_READ);
            ByteBuffer buffer = ByteBuffer.allocate(PACKET_SIZE);

            while (true) {
                selector.select();
                 var selectedKeys = selector.selectedKeys();
                 Iterator<SelectionKey> keyIterator = selectedKeys.iterator();

                 while (keyIterator.hasNext()) {
                     SelectionKey key = keyIterator.next();
                     keyIterator.remove();

                     if (key.isReadable()) {
                         var registeredChannel = (DatagramChannel) key.channel();
                         buffer.clear();
                         var clientAdress = registeredChannel.receive(buffer);
                         buffer.flip();
                         byte[] data = new byte[buffer.remaining()];
                         buffer.get(data);
                         String audioFilePath = new String(data);
                         System.out.printf("Client requested to listen to: " + audioFilePath);
                         new Thread(() -> sendDataToClient(audioFilePath,clientAdress,registeredChannel)).start();
                     }
                 }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sendDataToClient(String file, SocketAddress address, DatagramChannel channel) {

        ByteBuffer buffer = ByteBuffer.allocate(PACKET_SIZE);

        try (FileChannel fileChannel = FileChannel.open(Paths.get(file), StandardOpenOption.READ)){

            while (true) {
                buffer.clear();
                int bytesRead = fileChannel.read(buffer);
                if (bytesRead == -1) {
                    break;
                }

                buffer.flip();
                while (buffer.hasRemaining()) {
                    channel.send(buffer, address);
                }

                try {
                    TimeUnit.MILLISECONDS.sleep(22);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

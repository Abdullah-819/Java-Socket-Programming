import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();

        String msg = "Hello UDP Server";
        InetAddress address = InetAddress.getByName("localhost");

        DatagramPacket packet = new DatagramPacket(
                msg.getBytes(),
                msg.length(),
                address,
                7000
        );

        socket.send(packet);

        byte[] buffer = new byte[1024];
        DatagramPacket response = new DatagramPacket(buffer, buffer.length);

        socket.receive(response);
        System.out.println("Server: " + new String(response.getData(), 0, response.getLength()));

        socket.close();
    }
}
import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(7000);
        byte[] buffer = new byte[1024];

        System.out.println("UDP Server running...");

        while (true) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            String msg = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Client: " + msg);

            String response = "Received: " + msg;

            DatagramPacket reply = new DatagramPacket(
                    response.getBytes(),
                    response.length(),
                    packet.getAddress(),
                    packet.getPort()
            );

            socket.send(reply);
        }
    }
}
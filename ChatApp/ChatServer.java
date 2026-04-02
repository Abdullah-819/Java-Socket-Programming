import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static final Set<PrintWriter> clients = new HashSet<>();

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6000);
        System.out.println("Chat server started...");

        while (true) {
            new ClientHandler(server.accept()).start();
        }
    }

    static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;

        ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                synchronized (clients) {
                    clients.add(out);
                }

                String msg;
                while ((msg = in.readLine()) != null) {
                    synchronized (clients) {
                        for (PrintWriter client : clients) {
                            client.println(msg);
                        }
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                clients.remove(out);
            }
        }
    }
}
import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 5000;

        try (Socket socket = new Socket(host, port)) {

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            String userInput;
            while ((userInput = console.readLine()) != null) {
                output.println(userInput);
                System.out.println("Server: " + input.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
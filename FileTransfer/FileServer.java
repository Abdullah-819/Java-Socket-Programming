import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8000);
        System.out.println("File server started...");

        Socket socket = server.accept();

        File file = new File("sample.txt");
        FileInputStream fis = new FileInputStream(file);
        OutputStream os = socket.getOutputStream();

        byte[] buffer = new byte[4096];
        int bytes;

        while ((bytes = fis.read(buffer)) > 0) {
            os.write(buffer, 0, bytes);
        }

        fis.close();
        socket.close();
    }
}
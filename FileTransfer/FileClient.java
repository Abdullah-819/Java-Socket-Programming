import java.io.*;
import java.net.*;

public class FileClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8000);

        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("received.txt");

        byte[] buffer = new byte[4096];
        int bytes;

        while ((bytes = is.read(buffer)) > 0) {
            fos.write(buffer, 0, bytes);
        }

        fos.close();
        socket.close();
    }
}
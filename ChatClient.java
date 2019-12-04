import java.net.Socket;
import java.io.*;

public class ChatClient {
    final Socket s;
    final BufferedReader socketReader;
    final BufferedWriter socketWriter;
    final BufferedReader userInput;

    public ChatClient(String host, int port) throws IOException {

    }


    public void run() {

    }


    public synchronized void close() {

    }

    public static void main(String[] args)  {

    }


    private class Receiver implements Runnable{

        public void run() {
            while (!s.isClosed()) {
                String line = null;
                try {
                    line = socketReader.readLine();
                } catch (IOException e) {

                    if ("Socket closed".equals(e.getMessage())) {
                        break;
                    }
                    System.out.println("Connection lost");
                    close();
                }
                if (line == null) {
                    System.out.println("Server has closed connection");
                    close();
                } else {
                    System.out.println("Server:" + line);
                }
            }
        }
    }
}

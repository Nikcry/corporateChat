import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ChatServer {
    private ServerSocket ss;
    private Thread serverThread;
    private int port;

    BlockingQueue<SocketProcessor> q = new LinkedBlockingQueue<SocketProcessor>();

    public ChatServer(int port) throws IOException {

    }

    void run() {

    }

    private Socket getNewConn() {

    }

    private synchronized void shutdownServer() {

    }

    public static void main(String[] args) throws IOException {

    }

    private class SocketProcessor implements Runnable{

    }
}

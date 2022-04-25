package _22y._02m._17d_46.piskorky;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.time.LocalDateTime;

public class PiskorkyServer {
    public static PiskorkyStatus ps;

    public static void main(String[] args) throws IOException {
        PiskorkyServer.ps = new PiskorkyStatus(30);
        int port = 8081;
        int request = 0;
        ServerSocket listener = null;
        while (true) {
            try {
                listener = new ServerSocket(port);
                System.out.printf("The started on port %d%n", port);
                Socket socket = null;
                while (true) {
                    try {
                        socket = listener.accept();
                    } catch (IOException e) {
                        System.out.println("I/O error: " + e);
                    }
                    new ServerThread(socket).start();
                }
                } catch(SocketException e ){
                    System.out.println("Connection reset");
                    listener.close();
                    //listener.(port);
                    //listener = new ServerSocket(port);
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

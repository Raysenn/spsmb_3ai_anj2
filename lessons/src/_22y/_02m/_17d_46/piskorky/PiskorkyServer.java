package _22y._02m._17d_46.piskorky;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
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
            try  {
                listener = new ServerSocket(port);
                System.out.printf("The started on port %d%n", port);
                while (true) {
                    try (var socket = listener.accept()) {
                        switch (request) {
                            case 0:
                                try (var is = socket.getInputStream()) {
                                    request = is.read();
                                    System.out.println(request);
                                }
                                break;
                            // get local date
                            case 10:
                                try (var pw = new PrintWriter(socket.getOutputStream(), true)) {
                                    pw.println(LocalDateTime.now());
                                    request = 0;
                                }
                                break;
                            // get status
                            case 20:
                                try (var pw = new ObjectOutputStream(socket.getOutputStream())) {
                                    pw.writeObject(PiskorkyServer.ps);
                                    request = 0;
                                }
                                break;
                            case 30:
                                try (var is = new ObjectInputStream(socket.getInputStream())) {
                                    ps = (PiskorkyStatus) is.readObject();
                                    System.out.println(request);
                                    for (int i = 0; i < ps.rozmerHraciPlochy; i++) {
                                        for (int j = 0; j < ps.rozmerHraciPlochy; j++) {
                                            //System.out.format(" %02d ",this.ps.herniPlochaHracu[i][j]);
                                            int player = (int) ps.herniTlacitka[i][j].get("player");
                                            System.out.format("%02d ",  player);
                                        }
                                        System.out.println();
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                request = 0;
                                break;
                        }
                    }
                }
            } catch (SocketException e ) {
                System.out.println("Connection reset");
                listener.close();
                //listener.(port);
                //listener = new ServerSocket(port);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

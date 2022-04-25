package _22y._02m._17d_46.piskorky;

import java.io.*;
import java.net.Socket;
import java.time.LocalDateTime;

public class ServerThread extends Thread {
    private Socket socket;
    private int request;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream inp = null;
        DataOutputStream dos = null;
        ObjectInputStream ois = null;
        try {
            inp = socket.getInputStream();
            ois = new ObjectInputStream(inp);
            request = inp.read();
            System.out.println(request);
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (request) {
            case 0:
                System.out.println("Invalid request");
                break;
            // get local date
            case 10:
                try (var pw = new PrintWriter(socket.getOutputStream(), true)) {
                    pw.println(LocalDateTime.now());
                    request = 0;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            // get status
            case 20:
                try (var pw = new ObjectOutputStream(socket.getOutputStream())) {
                    pw.writeObject(PiskorkyServer.ps);
                    request = 0;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 30:
                try {
                    PiskorkyServer.ps = (PiskorkyStatus) ois.readObject();
                    System.out.println(request);
                    for (int i = 0; i < PiskorkyServer.ps.rozmerHraciPlochy; i++) {
                        for (int j = 0; j < PiskorkyServer.ps.rozmerHraciPlochy; j++) {
                            //System.out.format(" %02d ",this.ps.herniPlochaHracu[i][j]);
                            int player = (int) PiskorkyServer.ps.herniTlacitka[i][j].get("player");
                            System.out.format("%02d ", player);
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

package _22y._02m._17d_46.piskorky;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class PiskorkyClientTest {
    public static void main(String[] args) throws IOException {

        var hostname = "localhost";
        int port = 8081;
        int state = 0;
        while(state < 100) {
            try (var socket = new Socket(hostname, port)) {
                switch (state) {
                    case 0:
                        int s=30;
                        try (var writer = socket.getOutputStream()) {
                            writer.write(s);
                            //writer.flush();
                            state = s;
                        }
                        break;
                    case 10:
                        try (var reader = new InputStreamReader(socket.getInputStream())) {
                            int character;
                            var output = new StringBuilder();
                            while ((character = reader.read()) != -1) {
                                output.append((char) character);
                            }
                            System.out.println(output);
                            state = 100;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                        //Způsob získání instance třídy PiskorkyStatus pro aktualizaci
                        //hry po tahu libovolného hráče.
                    case 20:
                        try (var reader = new ObjectInputStream(socket.getInputStream())){
                            PiskorkyStatus ps = (PiskorkyStatus) reader.readObject();
                            System.out.println(ps.aktivniHrac);
                            System.out.println(ps.hraci.toString());
                            for (int i = 0; i < ps.rozmerHraciPlochy; i++) {
                                for (int j = 0; j < ps.rozmerHraciPlochy; j++) {
                                    //System.out.format(" %02d ",this.ps.herniPlochaHracu[i][j]);
                                    int player = (int) ps.herniTlacitka[i][j].get("player");
                                    System.out.format("%02d ",  player);
                                }
                                System.out.println();
                            }
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 30:
                        try (var writer = socket.getOutputStream()) {
                            var writerObject = new ObjectOutputStream(writer);
                            PiskorkyStatus ps = new PiskorkyStatus(10);
                            writerObject.writeObject(ps);
                        }
                        state = 101;
                        break;
                        default:
                            break;
                }
            }
        }
    }
}

package _22y._02m._14d_45.socket;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ASocketTimeClient {
    public static void main(String[] args) throws IOException {

        var hostname = "3.se.pool.ntp.org";
        int port = 13;

        try (var socket = new Socket(hostname, port)) {

            try (var reader = new InputStreamReader(socket.getInputStream())) {

                int character;
                var output = new StringBuilder();

                while ((character = reader.read()) != -1) {

                    output.append((char) character);
                }

                System.out.println(output);
            }
        }
    }
}

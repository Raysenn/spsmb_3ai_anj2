package _22y._03m._21d_49.vlakna;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GenDoMilionu {
    public static void main(String[] args) throws IOException {
        int k = 10;
        FileWriter write = new FileWriter("data.txt");
        PrintWriter print = new PrintWriter(write);
        for (int j = 0; j < 10000000; j++) {
            print.println(j);
            //System.out.print(j+1 + " ");
        }
        print.close();
    }
}
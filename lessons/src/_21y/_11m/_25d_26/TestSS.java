package _21y._11m._25d_26;

import java.util.Random;

//Za domácí úkol, který je nepovinný prohoďte dva libovolné prvky v tomto
//spojovém seznamu
public class TestSS {
    private final static int N = 1000;
    public static void main(String[] args) {
        Random r = new Random();
        SpojovySeznam ss1 = new SpojovySeznam(r.nextInt(N));
        for (int i = 0; i < 10; i++) {
            ss1.pridejNaKonec(new SpojovySeznam(r.nextInt(N)));
        }
        SpojovySeznam ss = ss1;
        do{
            System.out.format("hodnota: %s%n", ss.getHodnota());
        } while((ss=ss.getDalsi())!=null);
    }
}

package _22y._03m._24d_50.vlakna;

// Na ukončení vlákna čekáme pouze daný čas (timeout). Metoda isAlive() informuje
// o tom, zda vlákno doběhlo, tj. je ve stavu mrtvé (false), či nikoliv (true).

import _22y._03m._21d_49.vlakna.ReadV1;
import _22y._03m._21d_49.vlakna.Vlakno3;

public class ESynchronizaceVlaknaTimeout extends  Thread {
    public static void main(String[] args) throws InterruptedException {
        long zac = System.currentTimeMillis();
        ReadV1 vlCteni = new ReadV1("data.txt");
        vlCteni.start();
        Vlakno3 vlVypis = new Vlakno3();
        vlVypis.start();
        while(vlVypis.isAlive()) {
            // vlákno main čeká na ukončení vlákna vlVypis max 5 sekund
            vlVypis.join(5000);
            System.out.println("\t Kde se flákáš?!");
        }
        long konec = System.currentTimeMillis();
        System.out.println("Konec: " + (konec - zac));
    }
}
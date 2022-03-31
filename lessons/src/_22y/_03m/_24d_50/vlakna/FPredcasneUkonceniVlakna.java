package _22y._03m._24d_50.vlakna;

import _22y._03m._21d_49.vlakna.ReadV1;
import _22y._03m._21d_49.vlakna.Vlakno3;

// Přerušení vlákna je možné docílit metodou interrupt(). Metoda iterrupted()
// pak vrací true, pokud bylo vlákno touto metodou ukončeno (může být ukončeno)
// i z jiného vlákna.

public class FPredcasneUkonceniVlakna extends Thread {
    public void run() {
        while(ReadV1.hotovo == false) {
            System.out.println(ReadV1.suma + "\r");
            this.yield();
            if(this.interrupted()) {
                return;
            }
        }
        System.out.println(ReadV1.suma);
    }

    public static void main(String[] args) throws InterruptedException {
        long zac = System.currentTimeMillis();
        ReadV1 vlCteni = new ReadV1("data.txt");
        vlCteni.start();
        FPredcasneUkonceniVlakna vlVypis = new FPredcasneUkonceniVlakna();
        vlVypis.start();
        //zkusíme počkat 1 vteřinu, zda se vlákno neukončí do té doby samo
        vlVypis.join(1000);
        if(vlVypis.isAlive()){
            System.out.println("\t vypršel ti čas, skonči!");
            vlVypis.interrupt();
        }
        long kon = System.currentTimeMillis();
        System.out.println("Konec: " + (kon - zac));
    }
}

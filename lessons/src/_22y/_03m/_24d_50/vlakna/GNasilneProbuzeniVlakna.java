package _22y._03m._24d_50.vlakna;

// Pokud vlákno uspíme metodou sleep(), musíme ošetřit výjimku InterruptedException, která
// je vyhozena v případě, že je vlákno násilně vzbuzeno před uplynutím plánované doby spánku.
// volání metody interrupt() na vlákno je jedna z možností, jak vlákno násilně probudit
// (a ukončit).

import _22y._03m._21d_49.vlakna.ReadV1;

public class GNasilneProbuzeniVlakna extends Thread {
    public void run() {
        while(ReadV1.hotovo == false) {
            System.out.println(ReadV1.suma + "\r");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Předčasně vzbuzeno.");
                break;
            }
        }
        System.out.println(ReadV1.suma);
    }

    public static void main(String[] args) throws InterruptedException {
        long zac = System.currentTimeMillis();
        ReadV1 vlCteni = new ReadV1("data.txt");
        vlCteni.start();
        GNasilneProbuzeniVlakna vlVypis = new GNasilneProbuzeniVlakna();
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

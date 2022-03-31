package _22y._03m._24d_50.vlakna;

import _22y._03m._21d_49.vlakna.ReadV1;

// Dědění z třídy Thread má nevýhodu nemožnosti využívat vlákna u tříd, které již
// dědí jinou třídu. Vlastnosti vlákna tak může třída získat implementací rozhraní
// Runnable, které obsahuje pouze jednu metou - run()
public class BVlakno5  implements Runnable {
    private Thread zobrazVl = null;

    public void start() {
        this.zobrazVl = new Thread(this);
        this.zobrazVl.start();
    }
    @Override
    public void run() {
        while(ReadV1.hotovo == false){
            System.out.println(ReadV1.suma+"\r");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ReadV1 vlCteni = new ReadV1("data.txt");
        vlCteni.start();
        BVlakno5 vlVypis = new BVlakno5();
        vlVypis.start();
    }
}

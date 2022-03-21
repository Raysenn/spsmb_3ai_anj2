package _22y._03m._21d_49.vlakna;
// metoda yeld() zde slouží pro předání řízení dalšímu vláknu v pořadí
// (klidně i znovu tomu samému).
public class Vlakno2 extends  Thread {
    @Override
    public void run() {
        while(ReadV1.hotovo == false ) {
            System.out.print(ReadV1.suma + "\r");
            Thread.yield();
        }
        System.out.println(ReadV1.suma);
    }

    public static void main(String[] args) {
        ReadV1 vlCteni = new ReadV1("data.txt");
        vlCteni.start();
        Vlakno2 vlVypis = new Vlakno2();
        vlVypis.start();
    }
}

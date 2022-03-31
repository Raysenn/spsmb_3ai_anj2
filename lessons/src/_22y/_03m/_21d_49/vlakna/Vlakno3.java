package _22y._03m._21d_49.vlakna;

public class Vlakno3 extends  Thread {
    @Override
    public void run() {
        while(ReadV1.hotovo == false ) {
            System.out.print(ReadV1.suma + "\r");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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

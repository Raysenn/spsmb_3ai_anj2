package _12m._13d_31;

import java.util.ArrayList;
import java.util.Iterator;

class Hruska {
    private int cena;

    public Hruska(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Hruska{" +
                "cena=" + cena +
                '}';
    }
    public void tisk() {
        System.out.println(this.cena + ", ");
    }
}
public class IteratorZakladniPouziti {
    public static void main(String[] args) {
        ArrayList<Hruska> kosHrusek = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            kosHrusek.add(new Hruska(i+20));
        }
        //procházení pomocí iterátoru - způsob foreach
        for (Hruska h : kosHrusek) {
            h.tisk();
        }
        //procházení pomocí iterátoru - způsob for
        for (Iterator<Hruska> h = kosHrusek.iterator();h.hasNext();) {
            h.next().tisk();
        }
        //procházení pomocí iterátoru - způsob while
        Iterator<Hruska> h = kosHrusek.iterator();
        while (h.hasNext()) {
            h.next().tisk();
        }
    }
}

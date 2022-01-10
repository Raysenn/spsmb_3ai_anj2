package _22y._01m._10d_36;

import java.util.ArrayList;
import java.util.Iterator;

//Není možné při otevřeném iterátoru modifikovat (přidávat nebo ubírat prvky) kolekci
public class IteratorZmenaKolekce {
    public static void main(String[] args) {
        ArrayList<Integer> kont = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            kont.add(Integer.valueOf(i));
        }
        Iterator<Integer> it = kont.iterator();
        System.out.println(it.next());
        kont.add(Integer.valueOf(20));
        //výjimka ConcurentModificationException při použití it.next()
        System.out.println(it.next());
    }
}

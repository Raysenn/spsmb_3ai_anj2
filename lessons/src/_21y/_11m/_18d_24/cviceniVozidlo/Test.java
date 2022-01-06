package _21y._11m._18d_24.cviceniVozidlo;

import _21y._11m._18d_24.cviceniKolo.Kolo;
import _21y._11m._18d_24.cviceniKolo.horskeKolo;

public class Test {
    public static void main(String[] args) {

        Kolo k = new Kolo("opicak",1000, "bezmotorove vozidlo" );
        k.vypisCoJsiZac();

        System.out.println();

        horskeKolo hk = new horskeKolo("opice",10,true, "bezmotorove vozidlo", 10, 15);
        hk.vypisCoJsiZac();

        System.out.println();

        Motocykl m = new Motocykl("vopice", 1000, true, "motorové vozidlo", 15000);
        m.vypisCoJsiZac();

    }
}
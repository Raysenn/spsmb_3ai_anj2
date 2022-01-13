package _22y._01m._13d_37.vnoreneTridy;
// Časté použití v tzv. adaptérech - tam, kde např. z pěti již hotových metod chceme
// ve vnitřní třídě měnit pouze jednu a nechce se nám čtzři zastiňovat, což by bylo
// nutné při implementaci rozhraní. Týká se to do Java verze 8, kde nebylo možné
// deklarovat implicitní těla metod v rozhraní

import _21y._11m._22d_25.rozhrani.Info;

class Jmeno {
    public void kdoJeTo(Object o) {
        System.out.println(o.getClass().getName());
    }
}
class Usecka4 {
    protected int delka;

    public Usecka4(int delka) {
        this.delka = delka;
    }
}
class Obdelnik extends Usecka4 implements Info {
    private int sirka;

    public Obdelnik(int delka, int sirka) {
        super(delka);
        this.sirka = sirka;
    }
    public void kdoJsem(){
        new VnitrniJmeno().kdoJsem();
    }
    class VnitrniJmeno extends Jmeno {
        void kdoJsem() {
            System.out.println(" " + delka + "x" + sirka);
        }
    }

}
public class VnitrniTridaVytvorenaDedenim {
    public static void main(String[] args) {
        Info i = new Obdelnik(3,6);
        i.kdoJsem();
    }
}

package _22y._01m._13d_37.vnoreneTridy;

import _21y._11m._22d_25.rozhrani.Info;

class Usecka3 {
    int delka;

    public Usecka3(int delka) {
        this.delka = delka;
    }

    public Info i = new Info() {
        @Override
        public void kdoJsem() {
            System.out.println("Usecka " + delka);
        }
    };
}
public class PromennaTypuRozhraniSAnonVnitrniTridou {
    public static void main(String[] args) {
        Usecka3 u = new Usecka3(5);
        u.i.kdoJsem();
        if(u instanceof Info) System.out.println("u implementuje Info");
        if(u.i instanceof Info) System.out.println("u.i implementuje Info");
        if(u.i instanceof Info) System.out.println(u.i.getClass().getName() +" implementuje Info");
    }
}

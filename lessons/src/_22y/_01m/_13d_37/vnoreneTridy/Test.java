package _22y._01m._13d_37.vnoreneTridy;

import _21y._11m._22d_25.rozhrani.Info;

class Usecka {
    int delka;

    public Usecka(int delka) {
        this.delka = delka;
    }

    public Info informace() {
        return new UseckaInfo();
    }

    private class UseckaInfo implements Info {
        @Override
        public void kdoJsem() {
            System.out.println("Usecka " + delka);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Usecka u = new Usecka(5);
        //u.kdoJsem(); //nelze
        //Info i = u; // nelze
        Info i = u.informace();
        i.kdoJsem();
    }
}

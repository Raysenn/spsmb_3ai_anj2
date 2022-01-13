package _22y._01m._13d_37.vnoreneTridy;

import _21y._11m._22d_25.rozhrani.Info;

class Usecka2 {
    int delka;

    public Usecka2(int delka) {
        this.delka = delka;
    }
//anonymní vnitřní třída implementující rozhraní Info
    public Info informace() {
        return new Info() {
            @Override
            public void kdoJsem() {
                System.out.println("Usecka " + delka);
            }
        };

    }

}
public class AnonymniVnitrniTrida {
    public static void main(String[] args) {
        Usecka2 u = new Usecka2(5);
        //u.kdoJsem(); // nelze
        Info i = u.informace();
        i.kdoJsem();
    }
}

package _22y._01m._10d_36.polymorfismus;

public class Ptak extends Zivocich {
    int delkaKridel;

    public Ptak(String typ, int delka) {
        super(typ);
        this.delkaKridel = delka;
    }
    @Override
    public void vypisDelku() {
        System.out.println("Delka kridel: " + this.delkaKridel);
    }
}

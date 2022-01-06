package _21y._11m._15d_23.dedicnost;

public class Obdelnik {
    private int sirka;
    private int vyska;

    public Obdelnik(int sirka, int vyska) {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    public double delkaUhlopricky() {
        return Math.sqrt(this.sirka * this.sirka + this.vyska * this.vyska);
    }

    public int getSirka() {
        return sirka;
    }

    public int getVyska() {
        return vyska;
    }
}

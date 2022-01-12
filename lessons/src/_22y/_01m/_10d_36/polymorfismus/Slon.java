package _22y._01m._10d_36.polymorfismus;

public class Slon extends Zivocich{
    int delkaChobotu;

    public Slon(String typ, int delka) {
        super(typ);
        this.delkaChobotu = delka;
    }

    @Override
    public void vypisDelku() {
        System.out.println("Delka chobotu: " + this.delkaChobotu);
    }
}

package _21y._11m._22d_25.rozhrani;

public class Usecka2 implements Info, InfoDalsi {
    private int delka;

    public Usecka2(int delka) {
        this.delka = delka;
    }

    @Override
    public void kdoJsem() {
        System.out.print("Usecka");
    }

    @Override
    public void vlastnosti() {
        System.out.println(" = " + this.delka);
    }

    public int getDelka() {
        return delka;
    }
}

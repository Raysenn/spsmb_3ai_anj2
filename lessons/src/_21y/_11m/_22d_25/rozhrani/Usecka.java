package _21y._11m._22d_25.rozhrani;

public class Usecka implements Info{
    protected int delka;

    public Usecka(int delka) {
        this.delka = delka;
    }

    @Override
    public void kdoJsem() {
        System.out.print("Usecka - ");
        //System.out.println(this.getClass().getName());
    }
}

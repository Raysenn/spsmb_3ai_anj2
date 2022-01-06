package _21y._11m._22d_25.rozhrani;

public class Koule implements Info{
    private int polomer;

    public Koule(int polomer) {
        this.polomer = polomer;
    }

    @Override
    public void kdoJsem() {
        System.out.println("Koule");
    }
}

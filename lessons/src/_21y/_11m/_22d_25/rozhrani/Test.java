package _21y._11m._22d_25.rozhrani;

public class Test {
    public static void main(String[] args) {
        Usecka u = new Usecka(5);
        Koule k = new Koule(3);
        u.kdoJsem();
        k.kdoJsem();
        //rozhraní lze použít jako referenční proměnnou:
        Info i = new Usecka(5);
        i.kdoJsem();
        i = k;
        i.kdoJsem();
    }
}

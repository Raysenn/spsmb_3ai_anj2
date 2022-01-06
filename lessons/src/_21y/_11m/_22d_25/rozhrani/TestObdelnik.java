package _21y._11m._22d_25.rozhrani;

public class TestObdelnik {
    public static void main(String[] args) {
        Usecka u = new Usecka(5);
        Obdelnik o = new Obdelnik(2, 4);
        Info iu = new Usecka(6);
        Info io = new Obdelnik(3, 6);
        //implementované rozhraní se dědí beze změny
        u.kdoJsem(); //usecka
        o.kdoJsem(); //usecka
        iu.kdoJsem();
        io.kdoJsem();
    }
}

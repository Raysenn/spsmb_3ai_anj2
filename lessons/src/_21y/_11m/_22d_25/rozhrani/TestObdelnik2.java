package _21y._11m._22d_25.rozhrani;

public class TestObdelnik2 {
    public static void main(String[] args) {
        Obdelnik2 o = new Obdelnik2(2,4);
        Info io = new Obdelnik2(3, 6);
        InfoDalsi iod = new Obdelnik2(5, 7);
        o.kdoJsem(); o.vlastnosti();//Obdelnik=2,4
        io.kdoJsem();((Obdelnik2)io).vlastnosti();//Obdelnik=3,6
        ((Obdelnik2)iod).kdoJsem();iod.vlastnosti();//Obdelnik=5,7
        //Třída Usecka neimplementuje rozhrani InfoDalsi, toto nelze:
        //InfoDalsi iud = new Usecka(6);
        ((Obdelnik2) io).vypisSirku();//6
    }
}

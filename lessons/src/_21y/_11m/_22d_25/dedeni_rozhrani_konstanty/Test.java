package _21y._11m._22d_25.dedeni_rozhrani_konstanty;
import _21y._11m._22d_25.rozhrani.Info;
import _21y._11m._22d_25.rozhrani.InfoDalsi;

public class Test {
    public static void main(String[] args) {
        Info i = new Obdelnik(3, 6);
        InfoDalsi id = new Obdelnik(5, 7);
        InfoOba io = new Obdelnik(2,4);
        i.kdoJsem();((Obdelnik)i).vlastnosti(); // Obdelnik = 3,6
        ((Obdelnik)id).kdoJsem();id.vlastnosti(); //Obdelnik = 5,7
        io.kdoJsem();io.vlastnosti();//Obdelnik = 2,4
        System.out.println("Pocet rozhrani : "+ InfoOba.POCET);//3
    }
}

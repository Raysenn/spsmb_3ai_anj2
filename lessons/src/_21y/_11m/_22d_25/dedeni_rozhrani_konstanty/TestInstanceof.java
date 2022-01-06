package _21y._11m._22d_25.dedeni_rozhrani_konstanty;
import _21y._11m._22d_25.rozhrani.Usecka;
import _21y._11m._22d_25.rozhrani.Info;

//To zda třída implementuje určité rozhraní poynáme pomocí operátoru
//instanceof
//funguje i jako test, zda je instancí zadané, či zděděné třídy
public class TestInstanceof {
    public static void main(String[] args) {
        Usecka u = new Usecka(5);
        Obdelnik o = new Obdelnik(3, 6);
        if(u instanceof Info){
            System.out.println("u implementuje Info");//OK
        }
        if(o instanceof Info){
            System.out.println("o implementuje Info");//OK
        }
        if(u instanceof InfoOba){
            System.out.println("u implementuje InfoOba");//N
        }
        if(o instanceof InfoOba){
            System.out.println("o implementuje InfoOba");//OK
        }
        if(u instanceof Usecka){
            System.out.println("u je instanci Usecka");//OK
        }
        if(o instanceof Usecka){
            System.out.println("o je instanci Usecka");//OK
        }
    }
}

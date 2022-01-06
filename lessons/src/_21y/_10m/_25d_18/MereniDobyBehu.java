package _21y._10m._25d_18;
import _21y._10m._21d_17.*;
//System.currentTimeMillis() - vrátí počet milisekund od 1.1.1970
//System.nanoTime(); -
public class MereniDobyBehu {
    public static void main(String[] args) {
        long z, k, f=0;
        for (byte i = 6; i <= 20; i+=2) {
            System.out.format("%d!\t",i);
            //první časový okamžik do z
            //z = System.currentTimeMillis();
            z = System.nanoTime();
            //for (int j = 0; j < 500000; j++) {
                f = DomaciUkol.faktorial(i);
            //}
            System.out.format("=%d\t",f);
            //druhý časový okamžik dám do k
            //k = System.currentTimeMillis();
            k = System.nanoTime();
            System.out.format("%dns\t",(k-z));
            //znovu s rekurzivní verzí
            //první časový okamžik do z
            //z = System.currentTimeMillis();
            z =  System.nanoTime();
            //for (int j = 0; j < 500000; j++) {
                f = DomaciUkol.faktorialRekurzivne(i);
            //}
            System.out.format("=%d\t",f);
            //druhý časový okamžik dám do k
            //k = System.currentTimeMillis();
            k = System.nanoTime();
            System.out.format("%dns%n",(k-z));
        }
    }
}

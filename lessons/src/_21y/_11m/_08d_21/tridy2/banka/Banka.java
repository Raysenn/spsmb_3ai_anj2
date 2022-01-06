package _21y._11m._08d_21.tridy2.banka;

//Vytvořte třídu bankovní účet s potřebnými datovými prvky a metodami. Ve třídě Banka
//vytvořte pole účtů, které náhodně inicializujete. Vypište celkovou hotovost v bance.

import java.util.Arrays;
import java.util.Random;

public class Banka {
    final int N_UCTU = 14;
    public BankovniUcet[] poleUctu = new BankovniUcet[N_UCTU];
    public Banka(){
        for (int i = 0; i < poleUctu.length; i++) {
            Random rand = new Random();
            poleUctu[i] = new BankovniUcet(rand.nextInt(1000000),
                    String.format("Klient%03d", i));
        }
    }
    public int getHotovostBanky(){
        int out = 0;
        for (BankovniUcet bu: this.poleUctu) {
            out += bu.getZustatek();
        }
        return out;
    }
    public static void main(String[] args) {
        Banka spsBanka = new Banka();
        System.out.println(Arrays.toString(spsBanka.poleUctu));
        System.out.format("Zustatek v bance je %dKč%n", spsBanka.getHotovostBanky());
    }
}

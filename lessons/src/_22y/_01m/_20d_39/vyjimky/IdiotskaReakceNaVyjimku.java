package _22y._01m._20d_39.vyjimky;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// Nejhorší možný způsob reakce na výjimku - nedělat v bloku catch nic
public class IdiotskaReakceNaVyjimku {
    public static int[] vytvorANactiPole() {
        int[] pole = null;
        try {
            Scanner sc = new Scanner(new File("d2ata.txt"));
            int n = sc.nextInt();
            pole = new int[n];
            for (int i = 0; i < n; i++) {
                pole[i] = sc.nextInt();
            }
            return pole;
        }
        catch (Exception e) {
            // !!! Opravdu by zde mělo něco být !!!

            //např. následující výpis zásobníku, případně chyby
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            //System.out.println(e.getLocalizedMessage());

            //nebo je možné převézt kontrolovanou výjimku na nekontrolovanou
            throw new RuntimeException("Stala se chyba",e);

        }
        //return pole;
    }

    public static void main(String[] args) {
        int[] abc = vytvorANactiPole();
        System.out.println(Arrays.toString(abc));
    }
}

package _22y._01m._17d_38.vyjimky;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
// Pokud nechceme propagovat výjimku do nadřazené úrovně, je možné jiv metodě ošetřit.
// K této činnosti používáme jazykovou konstrukci try-catch. Do bloku try uzavřeme
// celý kód ve kterém se může výjimka vyskytnout, tzv. chráněný úsek. Bloch catch, který
// bezprostředně následuje, říká, na jakou výjimku a jak budeme reagovat.

public class KompletniOsetreniVyjimky {
    public static int[] vytvorANactiPole() {
        int[] pole = null;
        try {
            Scanner sc = new Scanner(new File("data1.txt"));
            int n = sc.nextInt();
            pole = new int[n];
            for (int i = 0; i < n; i++) {
                pole[i] = sc.nextInt();
            }
            return pole;
        }
        catch(Exception e) {
            System.out.println("Soubor neexistuje");
            System.exit(1); // ukončení programu
        }
        return pole;
    }

    public static void main(String[] args) {
        int[] abc = vytvorANactiPole();
        System.out.println(Arrays.toString(abc));
    }
}

package _22y._02m._03d_42.soubory;
//Další užitečné metody třídy FileReader:
//skip(long pocet)          - přeskočí při čtení zadaný počet znaků
//boolean markSuppoerted()  - zjišťuje, zda jsou podporovány následující 2 operace:
//reset()               - vrátí se na začátek souboru
//mark(long platnost)   - označí aktuální pozici v souboru značkou, na kterou se pak
//              bude vracet metoda reset(); parametr platnost udává
//              kolik znaků můžeme od aktuální označkované pozice ještě přečíst,
//              aniž by značka stratila platnost.

//Další užitečné metody třídy FileWriter:
//FileWriter(String jmeno, boolean append) - umožňuje při zápisu soubor
//      rozšiřovat.
//flush()       - okamžité zapsání bufferovaných dat na disk.

import java.io.*;

public class EDalsiDovednostiSeSoubory {
    public static void main(String[] args) throws IOException {
        File frJm = new File("a.txt");
        FileReader fr = new FileReader(frJm);
        FileWriter fw = new FileWriter("b.txt");
        long delka = frJm.length();
        int c;
        //první kopírování od začátku
        for (int i = 0; i < frJm.length(); i++) {
            c = fr.read();
            fw.write(c);
        }
        //přesun na začátek souboru
        //fr.reset(); //bohužel pro FileReader nepodporováno
        fr.close();
        fr = new FileReader(frJm);

        fw.close();
        //  rozšiřování souboru b.txt:
        fw = new FileWriter("b.txt", true);

        //druhé kopírování z poloviny
        fr.skip(delka/2);
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }
        fr.close();
        fw.close();

    }
}

package _22y._01m._17d_38.vyjimky;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Všechny výjimky implementují rozhraní Throwable
// Třída Error - věc JVM (interpreter Javy) - neumíme na
// ně reagovat. Př. OutOfMemoryError

// Třída Exception - kotrolované (checked) výjimky. Jsme nuceni
// se o ně postarat (tzv. ošetřit). Jsou to synchronní výjimky,
// pouze u některých metod. Typicky vstupně výstupní (IO) operace.
// Naše vlastní výjimky budou vždy synchronní

// Třída RuntimeException - asynchronní výjimky. Př.: ArithmeticException,
// NumberFormatException, ... Mohou se vyskytnout kdekoliv. Překladač
// nás nenutí na ně reagovat. Př.: "Zadej počet cihel: ", odpověď:
// "je mi to putna"

//Možnosti ošetření výjimky:
// 1. předání výjimky výše do nadřazené úrovně,
// 2. zachycení výjimky a kompletní ošetření v metodě, kde se vyskytla,
// 3. částečné ošetření v metodě, kde se vyskytla a navíc poslání informace
//    o jejím výskytu do nadřazené úrovně.

public class VyjimkyUvod {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("cisla.txt"));
        System.out.println("Precte neco ze souboru");
        int i = sc.nextInt();
        System.out.println("Cislo je: " + i);
    }
}

package _10m._21d_17;

import java.util.Scanner;

public class DomaciUkol {
/***
 * Každý sem napište metodu třídy dle zadání
 */
    //OK Fiala
    //public static int obsahObdelnika(int stranaA, int stranaB)
    public static int obsahObdelnika(int stranaA, int stranaB){
        return stranaA * stranaB;
    }

/**
    Hoffman
    public static int obsahPravouhlehoTrojuhelnika(int odvesnaA, int odvesnaB)

    Hojný
    public static int obvodObdelnika(int stranaA, int stranaB)
*/
    //OK Hudeček
    //public static int obvodPravouhlehoTrojuhelnika(int odvesnaA, int odvesnaB)
    public static int obvodPravouhlehoTrojuhelnika(int odvesnaA, int odvesnaB){
        int prepona = (odvesnaA *odvesnaA)+(odvesnaB * odvesnaB);
        double obvod = Math.sqrt(prepona) + odvesnaA + odvesnaB;
        int obvodInt = (int) Math.round(obvod);
        return obvodInt;

    }
/*
    Jiránek
    public static double objemKoule(double polomer)

    Kolář
    public static double obsahKruhu(double polomer)

    Novák A.
    public static double obvodKruhu(double polomer)

    OK Novák Š.
    public static int povrchKrychle(int hranaA)*/
    public static int povrchkrychle(int a){
     return 6 * a *a;
    }
    //OK Odstrčil
    //public static int objemKrychle(int hranaA)
     public static int objemKrychle(int hranaA){
        return hranaA*hranaA*hranaA;
     }
    //OK Pelikán
    //může si vybrat svou úlohu
    public static void printBoard(int sizeX, int sizeY) {
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                System.out.format("%s", j % 2 == 0 ? "██" : "  ");
            }
            System.out.print(i % 2 == 0 ? "\n  " : "\n");
        }
    }

    //OK Rosenbaum
    //public static long faktorial(byte n)
    public static long faktorial(byte n) {
        //if (n == 0) return 1; zbytečné
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    private static long faktorialRekurzivne(long n){
        if (n<=1){
            return 1;
        }else {
            return faktorialRekurzivne(n-1)*n;
        }
    }
    //OK Škrabánek
    //Výpočet fibbonaciho posloupnosti*/
    private static int fibonacci(int n){
        if (n <=1) return n;
        else return fibonacci(n-2)+fibonacci(n-1);
    }
    /**
    Vítek
    public static double povrchKoule(double polomer)
 ***/

}
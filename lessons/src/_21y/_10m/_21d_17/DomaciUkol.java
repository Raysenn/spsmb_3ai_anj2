package _21y._10m._21d_17;

public class DomaciUkol {
/***
 * Každý sem napište metodu třídy dle zadání
 */
    //OK Fiala
    //public static int obsahObdelnika(int stranaA, int stranaB)
    public static int obsahObdelnika(int stranaA, int stranaB){
        return stranaA * stranaB;
    }


    //Hofman
    //public static int obsahPravouhlehoTrojuhelnika(int odvesnaA, int odvesnaB)
    public static int obsahPravouhlehoTrojuhelnika(int odvesnaA, int odvesnaB){
        return (odvesnaA*odvesnaB)/2;

    }
/*
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

    //Jiránek
    public static double objemKoule(double polomer){
        return(4/3 * 3.14 * (polomer*polomer*polomer));
    }
/*
    Kolář
    public static double obsahKruhu(double polomer)*/
  public static double obsahKruhu(double polomer) {
      return (Math.PI*Math.pow(polomer,2));
  }
/*
    Novák A.
    public static double obvodKruhu(double polomer)
*/
    public static double obvodKruhu(double polomer){
        double pi = 3.1415926536;
        return 2 * pi * polomer;
    }
 /*   OK Novák Š.
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
    public static String[][] printBoard(int sizeX, int sizeY) {
        String[][] board = new String[sizeY][sizeX];
        String temporaryStr;
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                temporaryStr = (i + j) % 2 == 0 ? "██" : "  ";
                System.out.print(temporaryStr);
                board[i][j] = temporaryStr;
            }
            System.out.println();
        }
        return board;
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
    public static long faktorialRekurzivne(long n){
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
    public static double povrchKoule(double pU) {
        return (4.00*Math.PI)*Math.pow(pU,2);
    }

}

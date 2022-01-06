package _21y._10m._14d_15;

/**
 * Dvě třídy pro práci s řetězci
 * String - konstantní, nelze měnit -> rychlý
 * StringBuffer - měnitelný -> pomalejší
 * zásadní odlišnost od ostatních objektů - lze vyrobit instanci bez operátoru new
 * 1. prvek má index 0;
 */
public class StringN {

    //Vytvoření řetězce:
    public static void main(String[] args) {
        String s1, s2, s3, s4, s5, s6, s7;
        byte[] bytes = {(byte)'E', (byte)'v', (byte)'a'};
        char[] characters = {'M', 'a', 'r', 't', 'i', 'n', 'a'};
        StringBuffer charBuffer = new StringBuffer("Dobrý den");
        s1 = new String("Čau"); //Čau
        s2 = new String(s1);//Čau
        s3 = new String(bytes);//Eva
        //z pole bajtů se vezmou 2 bajty počínaje indexem 1
        //jedná se převod osmibitového znaku na 16 bitový, jak se to provede
        //záleží na přednastaveném kódování znaků
        s4 = new String(bytes, 1, 2);//va
        s5 = new String(characters);//Martina
        s6 = new String(characters,3, 4);//tina
        s7 = new String(charBuffer);//Dobrý den
        System.out.format("s1:%s, s2:%s, s3:%s%ns4:%s, s5:%s, s6:%s%ns7:%s%n",
                s1, s2, s3, s4, s5, s6, s7);
    }
}

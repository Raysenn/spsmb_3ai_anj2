package _21y._10m._14d_15;

public class Strings01 {
    //Dvě třídy pro práci s řetězci
    //String - konstantní, nelze měnit -> rychlý
    //StringBuffer - měnitelný -> pomalejší
    //zásadní odlišnost od ostatních objektů - lze vyrobit instanci bez operátoru new
    //1. prvek má index 0;
    //Vytvoření řetězce:
    //
    public static void main(String[] args) {
        String s1, s2, s3, s4, s5, s6, s7;
        byte[] bajty = {(byte)'E', (byte)'v', (byte)'a'};
        char[] znaky = {'M', 'a', 'r', 't', 'i', 'n', 'a'};
        StringBuffer buf = new StringBuffer("Dobrý den");
        s1 = new String("Čau"); //Čau
        s2 = new String(s1);//Čau
        s3 = new String(bajty);//Eva
        //z pole bajtů se vezmou 2 bajty počínaje indexem 1
        //jedná se převod osmibitového znaku na 16 bitový, jak se to provede
        //záleží na přednastaveném kódování znaků (konverze byte->String)
        s4 = new String(bajty, 1, 2);//va
        s5 = new String(znaky);//Martina
        s6 = new String(znaky,3, 4);//tina
        s7 = new String(buf);//Dobrý den
        System.out.format("s1:%s, s2:%s, s3:%s%ns4:%s, s5:%s, s6:%s%ns7:%s%n",
                s1, s2, s3, s4, s5, s6, s7);
        //Zjištění délky řetězce:
        System.out.format("délka s7:%d%n", s7.length());
        //Práce s řetězci
        //porovnání dvou řetězců
        //pokud je řetězec v parametru lexikálně větší, vrací zápornou hodnotu
        //pokud jsou shodné, vrací 0
        //pokud je řetězec v parametru lexikálně menší, vrací kladnou hodnotu
        System.out.format("%d%n", s5.compareTo("Z"));
        System.out.format("%b%n", s5.equals("Z"));
        //nerozlišování velkých a malých písmen
        System.out.format("%d%n", s5.compareToIgnoreCase("MARTINA"));
        //operátor == porovnává, zda jde o stejnou instanci třídy String
        //dvě různé instance (2 new), dostávám false
        System.out.println(new String("aha") == new String("aha"));
        String tmpStr=s1;
        //stejné instance:
        System.out.println(tmpStr==s1);
        //převod na malá písmena
        System.out.println(s1.toLowerCase());
        //převod na velká písmena
        System.out.println(s1.toUpperCase());
        //nahrazování znaků
        System.out.println(s1.replace('u','ů'));
        //skládání řetězců
        System.out.println(s1+" "+s2);
        System.out.println(s1.concat(" ").concat(s2));
        //podřetězce (substring)
        System.out.println(s7.substring(6));//Dobrý den -> den
        System.out.println(s7.substring(2,5));//Dobrý den -> brý ten pátý už se nepočítá
        //konrola začátku a konce řetězce
        System.out.println(s7.startsWith("Dobrý"));
        System.out.println(s7.endsWith("den"));
        //ořezání bílých znaků
        System.out.println("\r\n\t ahoj\t \r\n".trim());
        //vrácení znaku z řetězce
        String tmps1="mala a VELKA";
        //V - známe z třídy Scanner, metoda nextLine().charAt(0)
        System.out.println(tmps1.charAt(7));
        //nalezení prvního znaku v řetězci - od začátku
        System.out.println(tmps1.indexOf('a'));
        //nalezení prvního znaku v řetězci - od konce
        System.out.println(tmps1.lastIndexOf('a'));
        //konverze primitivního datového typu na řetězec
        //používám metodu třídy String
        System.out.format("%s%n",String.valueOf(15));
        //lze i takto
        System.out.format("%s%n",(""+15));
        //String.format() - známe dobře z System.out.format()
        //Převod řeťezce na primitivní datový typ
        //1. možnost ObalovaTrida.valueOf("3.14").xxxValue - pomalejší, vyrábí se nový objekt
        System.out.println(Double.valueOf("3.14").doubleValue());
        //2. možnost ObalovaTrida.parseXXX("3.14") - rychlejší varianta, cca 20%
        System.out.println(Double.parseDouble("3.14"));
        //více metod v jenom příkazu
        String in = "\r\n\t cacao\t \r\n";
        int i =in.trim().toUpperCase().substring(2).indexOf('O');
        System.out.println(i);
    }
}

package _21y._10m._21d_17.StringsProcvicovani;
//Napište metodu void tiskPI(int pocetDesMist), která bude tisknout číslo
//Math.PI s přesností na zadaný počet desetinných míst
public class TiskPi {
    public static void tiskPI(int pocetDesMist) {
        if (pocetDesMist > 15) return;
        double pi, result;
        String s, a, b, con;
        pi = Math.PI;
        s = String.valueOf(pi);
        StringBuffer sb = new StringBuffer(s);
        a = sb.substring(0, 2);
        b = sb.substring(2, pocetDesMist + 2);
        con = a.concat("").concat(b);
        result = Double.parseDouble(con);
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println(Math.PI);
        tiskPI(12);

    }
}

package _22y._01m._17d_38.domaci_ukol;

// Použijte znalosti z _13d_37.rozhrani_od_java8 k vytvoření rozhraní Info, který
// bude implementovat implicitní (default) metodu kdoJsem() podobně jako v příkladu
// _13d_37.vnorene_tridy.Test

public class Zadani extends Rodic implements Info {
    public static void main(String[] args) {
        Info i = new Zadani();
        i.kdoJsem();
        Info.kdoJsemStatic();
        Zadani.kdoJsemRodicStat();
        Rodic.kdoJsemRodicStat();

    }
}

package _21y._11m._22d_25.rozhrani;

public class Test2 {
    public static void main(String[] args) {
        Usecka2 u = new Usecka2(5);
        u.kdoJsem();
        u.vlastnosti();
        //Instance rozhraní může využívat jen metody rozhraní
        Info info = new Usecka2(2);
        info.kdoJsem();
        //info.vlastnosti(); //NELZE
        //System.out.println(info.getDelka()); //NELZE
    }
}

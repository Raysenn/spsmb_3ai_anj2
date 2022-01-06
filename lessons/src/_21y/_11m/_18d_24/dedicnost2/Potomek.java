package _21y._11m._18d_24.dedicnost2;
// Finální metoda .getClass() dokáže poskytnout za běhu programu aktuální
// informace o libovolném objektu. Vrací objekt třídy Class, což je přímý
// podomek třídy Object

class Rodic{
    public int i;
    public Rodic() {
        this.i = 1;
    }
}
public class Potomek extends Rodic {
    public static void main(String[] args) {
        Potomek dite = new Potomek();
        System.out.format("Jmeno tridy je: %s%n", dite.getClass().getName());
        System.out.format("Jmeno rodicovske tridy ja: "
                + dite.getClass().getSuperclass().getName());
    }
}

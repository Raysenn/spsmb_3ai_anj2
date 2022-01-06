package _21y._11m._25d_26;

//vytvoříme jednosměrný spojový seznam (single linked list)
// objektů, který se bude na sebe odkazovat
//pomocí členské proměnné dalsi
public class SpojovySeznam {
    private int hodnota;
    private SpojovySeznam dalsi;

    public SpojovySeznam(int hodnota) {
        this.hodnota = hodnota;
        this.dalsi = null;
    }
    //najdi koncový objekt (ten, který má členskou
    // proměnnou další null)
    public void pridejNaKonec(SpojovySeznam obj){
        SpojovySeznam ss = this;
        while(ss.getDalsi() != null){
            ss = ss.getDalsi();
        }
        ss.dalsi=obj;
    }

    public int getHodnota() {
        return hodnota;
    }

    public SpojovySeznam getDalsi() {
        return dalsi;
    }
}

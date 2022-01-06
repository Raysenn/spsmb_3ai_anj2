package _21y._12m._20d_33;

public class Vaha {
    double vaha;

    public Vaha(double vaha) {
        this.vaha = vaha;
    }

    @Override
    public String toString() {
        return "" +vaha ;
    }
    @Override
    public int hashCode() {
        return (int) this.vaha;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj instanceof Vaha == false) {
            return false;
        }
        return (this.vaha == ((Vaha) obj).vaha);
    }
}
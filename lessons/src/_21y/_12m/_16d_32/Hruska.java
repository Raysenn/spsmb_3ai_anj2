package _21y._12m._16d_32;

public class Hruska implements Comparable<Hruska>{
    private int cena;
    public Hruska(int cena) {
        this.cena = cena;
    }

    @Override
    public int compareTo(Hruska o) {
        if(this.cena > o.cena) { return +1; }
        else if (cena == o.cena ) {return 0; }
        else return -1;
    }

    @Override
    public int hashCode() {
        return this.cena;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj instanceof Hruska == false) {
            return false;
        }
        return (cena == ((Hruska) obj).cena);
    }

    @Override
    public String toString() {
        return String.format("%d", this.cena);
    }
}

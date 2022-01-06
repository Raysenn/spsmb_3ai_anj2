package _21y._10m._11d_14.A_Exercices_02;

public class PravouhlyTrojuhelnik {
    private final double odvesnaA;
    private final double odvesnaB;

    public PravouhlyTrojuhelnik(double odvesnaA, double odvesnaB) {
        this.odvesnaA = odvesnaA;
        this.odvesnaB = odvesnaB;
    }
    public double delkaPrepony() {
        return Math.sqrt((odvesnaA * odvesnaA) + (odvesnaB * odvesnaB));

    }

    public PravouhlyTrojuhelnik(double odvesnaA) {
        this(odvesnaA,odvesnaA);
    }
    public double obsah() {
        return (odvesnaA * odvesnaA)/2;
    }

}

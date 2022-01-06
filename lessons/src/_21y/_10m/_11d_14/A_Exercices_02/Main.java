package _21y._10m._11d_14.A_Exercices_02;

public class Main {
    /*
    Vytvořte třídu pravoúhlý trojúhelník, kdy se jako parametry konstruktoru
    budou zadávat pouze odvěsny a přepona se dopočítá. Třída bude poskytovat
    metodu double delkaPrepony.
     */
    /*
    Přetěžte konstruktor PravouhlyTrojuhelnik(), který vytvoří rovnoramenný
    pravoúhlý trojúhelník s odvěsnami délky 1. Třída bude poskytovat metodu
    double obsah()
     */
    public static void main(String[] args) {
        PravouhlyTrojuhelnik prav = new PravouhlyTrojuhelnik(3, 4);
        System.out.println("prepona pravouhleho " + prav.delkaPrepony());
        PravouhlyTrojuhelnik rov = new PravouhlyTrojuhelnik(1);
        System.out.println("prepona pravouhleho rovnoramenneho  " + rov.delkaPrepony());
        System.out.println("obsah pravouhleho rovnoramenneho " + rov.obsah());
    }
}

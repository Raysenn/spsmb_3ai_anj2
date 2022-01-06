package _21y._10m._11d_14;

/**
 * Ukončení práce s objekty (finalizer - opak konstruktoru
 */
// Ukončení práce s objekty (finalizer - opak konstruktoru)
public class Customer {
    public static int nCustomers = 0;   // Proměnná třídy
    public int spent;

    //potřebná znalost dědění (klíčová slova super, protected)
    protected void finalize() throws Throwable{
        nCustomers--;
        System.out.println("Konec zakaznika");
        super.finalize();
    }

    public Customer() {
        Customer.nCustomers++;
        nCustomers++;
        this.spent = 0;
    }

    public void buy(int price) {
        this.spent += price;
    }

    public static void main(String[] args) {
        System.out.format("Počet zákazníků: %d%n", Customer.nCustomers);
        Customer a = new Customer();
        System.out.format("Počet zákazníků: %d%n", Customer.nCustomers);
        Customer b = new Customer();
        System.out.format("Počet zákazníků: %d%n", Customer.nCustomers);

        System.out.format("A utratil: %d%n", a.spent);
        a.buy(100);
        System.out.format("A utratil: %d%n", a.spent);
        b.buy(69);
        System.out.format("B utratil: %d%n", b.spent);
        System.out.format("utratili: %d%n", a.spent + b.spent);
        a = null;
        // Nutné vynucení si zrušení objektu (instance třídy Customer)
        System.runFinalization();   // Vynucení si spuštění finalizéru
        System.gc();                // Volání Garbage Collectoru
        System.out.format("Počet zákazníků: %d%n", Customer.nCustomers);
    }
}

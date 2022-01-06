package _21y._10m._11d_14;

/**
 * Vytvoření statického inicializačního bloku,
 * který po spuštění programu napošítá prvních MAX prvočísel
 */
public class PrimeNumbers {
    public static final int MAX = 1000;
    public static final int numbers[] = new int[MAX];
    // Staticky inicializační blok - obdoba konstruktoru, ale ve světě proměnných třídy (statických)

    static {
        int count = 2;
        numbers[0] = 1;
        numbers[1] = 2;
        next:
        for (int i = 3; count < numbers.length; i += 2) {
            // Zjištění, zda je číslo prvočíslo (dělitelné jen samo sebou a jedničkou)
            for (int j = 2; j < count; j++) {
                if (i % numbers[j] == 0) {
                    // Tohle není prvočíslo
                    continue next;
                }
            }
            numbers[count] = i;
            count++;
        }
    }

    public static void main(String[] args) {
        System.out.format("Prvních %d prvočísel: %n", MAX);
        for (int number : numbers) {
            System.out.printf("%4d%n", number);
        }
    }
}

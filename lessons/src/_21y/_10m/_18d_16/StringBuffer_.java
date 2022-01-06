package _21y._10m._18d_16;

//Třída StringBuffer - možnost měnit uložený  řetězec
public class StringBuffer_ {
    public static void main(String[] args) {
        //inicializace, k dispozici 3 konstruktory
        StringBuffer b1, b2, b3;
        //inicializuje řetězec o kapacitě 16 znaků
        b1 = new StringBuffer();
        //inicializuje řetězec o kapacitě 100 znaků
        b2 = new StringBuffer(100);
        //inicializuje řetězec o kapacitě 20 znaků - 4 pro Ahoj a 16 jako rezervu
        b3 = new StringBuffer("Ahoj");

        //Kapacitu řetězce je možné změnit 2 metodami
        // 1. ensureCapacity(int k) - pro k větší, než je současná kapacita zajistí, že řetězec bude mít
        //buď kapacitu o velikosti k, nebo dvojnásobek současné kapacity + 2 znaky navíc. Záleží na tom,
        //co z toho je větší.
        //2. setLength(int k) - pro k větší, než současná kapacita zvětší aktuální délku řetězce na k a
        //kapacitu na dvojnásobek současné kapacity + 2 znaky.
        //                    - pro k menší, nebo rovno současné kapacitě bude kapacita nezměněna a aktuální
        //                    délka se nastaví na k

        System.out.format("b1 délka:%d, kapacita:%d%n",b1.length(), b1.capacity()); //0 16
        System.out.format("b2 délka:%d, kapacita:%d%n",b2.length(), b2.capacity()); //0 100
        System.out.format("b3 délka:%d, kapacita:%d%n",b3.length(), b3.capacity()); //4 20
        b1.setLength(18);
        b2.ensureCapacity(110);
        b3.setLength(3);
        System.out.format("b1 délka:%d, kapacita:%d%n",b1.length(), b1.capacity());//18 34
        System.out.format("b2 délka:%d, kapacita:%d%n",b2.length(), b2.capacity());//0 202
        System.out.format("b3 délka:%d, kapacita:%d%n",b3.length(), b3.capacity());//3 20

        //metoda reverse
        StringBuffer b = new StringBuffer("Ahoj");
        b.reverse();
        System.out.println(b);
        //změna pomocí .append()
        b = new StringBuffer("Ahoj ");
        b.append("lidi"); //může být i jakýkoliv primitivní typ
        System.out.println(b);
        //vyříznutí řetězce
        b.delete(5,9); //lidi
        System.out.println(b);
        //vymazání znaku
        b.deleteCharAt(0);
        System.out.println(b);//hoj
        //vkládání
        b.insert(0,3.14);
        System.out.println(b);//3.14hoj
        b.insert(1,"HOJ");
        System.out.println(b);//3HOJ.14hoj
        //doma si vyzkoušejte
        // .replace(int počIdx, int koncIdx, String nový podřetězec)
        // .charAt(int idx)

        //nahrazení písmena
        b.setCharAt(1,'!');
        System.out.println(b);//3!OJ.14hoj

        //Konverze na String
        b = new StringBuffer("Ahoj");
        String s1, s2, s3;
        s1 = b.toString();
        System.out.println(s1);//Ahoj
        s1 = ""+b;
        System.out.println(s1);//Ahoj
        s2 = b.substring(1);
        System.out.println(s2);//hoj
        s3 = b.substring(1, 3);
        System.out.println(s3);//ho

    }

}

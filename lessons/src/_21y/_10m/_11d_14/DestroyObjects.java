package _21y._10m._11d_14;

/**
 * Rušení objektů
 */
public class DestroyObjects {

    public static void main(String[] args) {
        InstanceMethods im = new InstanceMethods();
        im.setX(4);
        System.out.println(im.getX());
        //zrušení objektu (instance třídy InstanceMethods) im:
        im = null;
        System.out.println(im.getX());//objekt zrušen, výjimka se vyhodí

    }
}

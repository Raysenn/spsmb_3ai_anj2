package _21y._10m._11d_14;

//Proměnné a metody instance
public class InstanceMethods {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    //Mohu vytvořit objekt pomocí operátoru new
    //libovolný počet instancí
    //použití:
    public static void main(String[] args) {
        InstanceMethods im = new InstanceMethods();
        im.setX(2);
        System.out.println(im.getX());
    }

}

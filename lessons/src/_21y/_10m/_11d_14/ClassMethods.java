package _21y._10m._11d_14;
//Proměnné a metody třídy, též statické
public class ClassMethods {
    private static int x;
    private static int y;

    public static int getX(){
        return ClassMethods.x;
    }
    //Mám pouze jeden paměťový prostor (zde třída
    // ClassMethods)
    //použití:
    public static void main(String[] args) {
        ClassMethods.x=2;
        ClassMethods.y=5;
        System.out.println(ClassMethods.getX());
    }
}

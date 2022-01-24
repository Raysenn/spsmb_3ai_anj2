package _22y._01m._17d_38.domaci_ukol;

public interface Info {
    default void kdoJsem(){
        System.out.println("Jsem " + this.getClass().getSimpleName());
    }
    static void kdoJsemStatic() {
        System.out.println("Jsem " + Info.class.getSimpleName());
    }
}

package _22y._01m._17d_38.domaci_ukol;

public interface Info {
    static void kdoJsemStat(){
        System.out.println(Info.class.getSimpleName());
    }
    default void kdoJsem(){
        System.out.println(this.getClass().getSimpleName());
    }
}

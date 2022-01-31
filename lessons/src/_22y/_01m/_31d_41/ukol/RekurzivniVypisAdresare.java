package _22y._01m._31d_41.ukol;

import java.io.File;
import java.io.FilenameFilter;

public class RekurzivniVypisAdresare {
    static int depth = 0;
    public static File[] vypisAdresar(File addr){
        File[] seznam = addr.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return (new File(dir, name)).isDirectory();
            }
        });
        return seznam;
    }
    public static void rekVypis(File f){
        depth++;
        File[] af = vypisAdresar(f);
        if(af.length == 0){
            for (int i = depth; i >= 0 ; i--) {
                System.out.print("  ");
            }
            System.out.println(f.getName());
        } else {
            for (File ff : af) {
                if(ff.isDirectory())
                    rekVypis(ff);
            }
        }
        depth--;
    }
    public static void main(String[] args) {
        /*File[] seznam = vypisAdresar(new File("c:\\"));
        //File[] seznam = vypisAdresar(new File("/"));
        for (int i = 0; i < seznam.length; i++) {
            System.out.println(seznam[i].getName() + " " + Arrays.toString(vypisAdresar(seznam[i])));
        }*/
        rekVypis(new File("C:\\Program Files\\dotnet"));
    }
}

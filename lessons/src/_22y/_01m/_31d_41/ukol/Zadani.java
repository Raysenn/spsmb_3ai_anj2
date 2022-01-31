package _22y._01m._31d_41.ukol;
// 1. Napište program, který vypisuje jména všech podadresářů v zadaném rodičovském adresáři.
// 2. Modifikujte předchozí program tak, že budou vypisovány i všechny vnořené adresáře
//    z těchto podadresářů.
// 3. Napište program, který vypíše podle zadané masky všechny soubory, které se nacházejí v zadaném
//    rodičovském adresáři.
// 4. Modifikujte předchozí program tak, že budou vypisovány i soubory ze všech vnořených adresářů
//    z těchto podadresářů.

import java.io.File;
import java.io.FilenameFilter;

public class Zadani {
    public static void main(String[] args) {
        File f = new File("C:\\");
        File[] fileList = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return (new File(dir, name)).isDirectory();
            }
        });
        //totéž  s lambda operátorem "čtyřtečka" ::
        //File[] fileList = f.listFiles(File::isDirectory);
        for (File file : fileList) {
            System.out.println(file.getName());
        }
    }



}

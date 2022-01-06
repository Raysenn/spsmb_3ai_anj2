package _21y._12m._16d_32;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetATreeSet {
    public static void naplneniATisk(Set<String> st) {
        st.add("treti");
        st.add("prvni");
        st.add("druhy");
        //pokus o vložení stejného prvku
        if(st.add("treti") == false){
            System.out.println("prvek treti nevlozen");
        }
        System.out.println(st.size() + " " +st);
        /*for (String s: st) {
            System.out.print(s + ", ");
        }*/
        for (Iterator<String> h = st.iterator(); h.hasNext();) {
            System.out.print(h.next() + (h.hasNext()?", ":""));
        }
        if(st.contains("treti")) {
            System.out.println("\n'treti' je v mnozine");
        }
        st.remove("treti");
        System.out.println(st);
        st.clear();
    }
    public static void main(String[] args) {
        System.out.println("HashSet:");
        naplneniATisk(new HashSet<String>());
        System.out.println("TreeSet:");
        naplneniATisk(new TreeSet<String>());
    }
}

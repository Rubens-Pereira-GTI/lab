package arrays_collections;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        SortedSet<String> listaNomes = new TreeSet<>();
        listaNomes.add("Rubens");
        listaNomes.add("Adriana");
        listaNomes.add("João");
        listaNomes.add("Amanda");

        System.out.println(listaNomes);

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Rubens");
        lista.add("Adriana");
        lista.add("João");
        lista.add("Amanda");
        
        lista.remove(3);
        lista.remove(new String("Rubens"));
        System.out.println(lista);
    }
}

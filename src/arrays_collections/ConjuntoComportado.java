package arrays_collections;

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
    }
}

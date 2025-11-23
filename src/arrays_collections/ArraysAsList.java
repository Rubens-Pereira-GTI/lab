package arrays_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();
        names.add("Rubens");

        List<String> nomes = Arrays.asList("João", "Rubens", "Bruno", "Camila", "Mariana");
        nomes.add("Camila");

        System.out.println(names.get(0));
        System.out.println(nomes);
    }
}

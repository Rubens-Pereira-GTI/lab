package generics;

import java.util.TreeSet;

public class ComparableTeste {
    public static void main(String[] args) {
        
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(10);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);

        for(Integer n: numeros){
            System.out.println(n);
        }
    }
}

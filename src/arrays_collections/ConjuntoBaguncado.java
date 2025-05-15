package arrays_collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings("unchecked")
    
    public void bagunca(){
        HashSet lista1 = new HashSet();
        Set lista2 = new HashSet();

        lista1.add("Rubens");
        lista1.add(10);
        lista1.add(new Usuario());
        lista1.add(7.6);
        lista1.add(true);
        
        lista2.add(1);
        lista2.add(2);
        lista2.add(10);

        boolean teste= lista1.remove("Rubens");

        System.out.println("Tamanhos da Lista 1: "+lista1.size());
        System.out.println("Tamanho da Lista 2: "+ lista2.size());

        System.out.println("objeto removido: "+ teste);

        //lista1.addAll(lista2);
        lista1.retainAll(lista2);
        System.out.println("Tamanhos da Lista 1: "+lista1.size());



    }

    public static void main(String[] args) {
        ConjuntoBaguncado baguncinha = new ConjuntoBaguncado();
        baguncinha.bagunca();
    }
}

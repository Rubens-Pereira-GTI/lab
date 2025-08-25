package generics;

import java.util.Set;
import java.util.TreeSet;


public class Pares<C extends Number, V> {

    private final Set<Par<C, V>> itens = new TreeSet<>();

    public void adicionar(C chave, V valor){
        
        if(chave == null) return;
        
        if(chave != null){


        }
        itens.add(new Par<C, V>(chave, valor));
    }

}

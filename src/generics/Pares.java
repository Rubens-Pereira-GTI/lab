package generics;

import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class Pares<C extends Number, V> {

    private final SortedSet<Par<C, V>> itens = new TreeSet<>();

    public void adicionar(C chave, V valor){        
       // se a chave for null saia do método
        if(chave == null) return;
        //Cria um tipo par para depois verificar se ele já existe, 
        //se ele existir então removemos ele da lista
        Par<C,V> novoPar = new Par<C, V>(chave, valor);
        if(itens.contains(novoPar)){
            itens.remove(novoPar);
        }
        //adicionamos o objeto do tipo par testado na lista
        itens.add(novoPar);
    }

    /*
     * Faça um método que getValor que receba uma parametro com a chave
     * verifique se o valor recebido é null
     * ache o objeto através da chave utilizando uma stream
     * Dica: utilize o filter
     * Dica: capture o resultado em um optional 
     */
    public V getValor(C chave){
        if(chave == null) return null;
        Optional<Par<C,V>> parOptional = itens.stream().filter(par -> 
            chave.equals(par.getChave()))
            .findFirst();

        return parOptional.isPresent() ? parOptional.get().getValor(): null;
    }

}

package oo.composicao;

import java.util.ArrayList;

public class Compra {  
    String cliente;    
    
    ArrayList<Item> listaItens = new ArrayList<Item>();

    void adicionarItem(String nome, int qt, double valor){
        adicionarItem(new Item(nome, qt, valor));
    }

    void adicionarItem(Item item){
        listaItens.add(item);
        item.compra=this;
    }
    
   public double getValorTotal(){
        double totalCompra=0;

        for(Item it : listaItens){
            totalCompra += it.preco;
        }
        return totalCompra;
   }

}

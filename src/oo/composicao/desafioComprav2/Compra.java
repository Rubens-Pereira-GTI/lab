package oo.composicao.desafioComprav2;

import java.util.ArrayList;

public class Compra {
    private Cliente cliente;
    private ArrayList<Item> listaItens = new ArrayList<Item>();   
   
    Compra(Cliente cliente){
        this.cliente= cliente;    
        cliente.addCompra(this);       
    }

   //metodo main é quem utiliza esse método
    void addCompra(Item item){
        listaItens.add(item);
        item.setCompra(this);
    }

    double totalCompra(){   
        double total=0;   
        
        for(Item item : listaItens){
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        System.out.println("Total da compra: "+ total);
        return total;
    }
}

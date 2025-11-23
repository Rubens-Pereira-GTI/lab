package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    Cliente cliente;
    ArrayList<Item> listaItens = new ArrayList<Item>();    

    Compra(Cliente cliente){
        this.cliente= cliente;
        cliente.listaCompras.add(this);
    }
    double valorTotal(){
        int qtd=0;
        double valorTotal = 0;
        //System.out.println("*****"+listaItens.size());
        for(Item item : listaItens){
            //System.out.println("preço do produto:"+ item.produto.preco );
            qtd = item.quantidade;
           //System.out.println("quantidade: "+qtd);
            valorTotal += item.produto.preco * qtd; 
        }
        System.out.println("valor compra: "+valorTotal);
        return valorTotal;
    }
}

package oo.composicao.desafioComprav2;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;    
    private ArrayList<Item> listaItens = new ArrayList<Item>();

    Produto(String nomeProduto, double preco){
        nome = nomeProduto;
        this.preco = preco;
    }

    void addProduto(Item item){
        listaItens.add(item);
    }

    double getPreco(){
        return preco;
    }
    

}

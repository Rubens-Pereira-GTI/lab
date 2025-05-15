package oo.composicao.desafio;

import java.util.ArrayList;

public class Produto {
    String nome;
    double preco;    
    ArrayList<Item> listaItens = new ArrayList<Item>();

    //podia optar por passar logo o item porém vou criar um método que recebera o objeto Item e o adicionara na lista
    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }




}

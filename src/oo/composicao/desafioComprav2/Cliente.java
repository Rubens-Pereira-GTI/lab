package oo.composicao.desafioComprav2;

import java.util.ArrayList;

//cliente tem nome e uma lista do tipo ArrayList tipada com Compra 
// ele faz um calculo com todas as compras, atráves de uma lista que esta em compra
//
public class Cliente {
    private String nome;
    private ArrayList<Compra> listaCompra = new ArrayList<Compra>();

    Cliente(String nome){
        this.nome=nome;
    }

    String getNome(){
        
        return nome;
    }
    
    String setNome(String nome){
        return nome;
    }

    void addCompra(Compra compra){
        System.out.println("meu resultado");
        listaCompra.add(compra);
    }

    void obterValorTotal(){
        double total=0;
        for(Compra compra : listaCompra){
            total += compra.totalCompra();
        }
        System.out.println("total das Compras: "+total);

    }
}

package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    String nome; 
    ArrayList<Compra> listaCompras = new ArrayList<Compra>();
    
    Cliente(String nome){
        this.nome = nome;
    }

    void obterValorTotal(){
        double valorTotal=0;

        System.out.println("Cliente fez "+ listaCompras.size() + " Compras" );
        System.out.println(listaCompras.get(0).valorTotal());


        for(Compra c : listaCompras){
            valorTotal += c.valorTotal();
        }
        System.out.print("E o total das compras foi de: " +valorTotal);

    }
    
}

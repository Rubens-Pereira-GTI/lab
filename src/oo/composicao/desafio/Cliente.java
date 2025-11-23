package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    String nome="Rubens"; 
    int num=1;
    Integer numInstancia = num;     
    char n;
    char letra;

    ArrayList<Compra> listaCompras = new ArrayList<Compra>();
    
    Cliente(String nome){
        this.nome = nome;
    
    }   

    void imprimirAlgo(String nome){
        System.out.println(nome);
    }

    void obterValorTotal(){
        double valorTotal=0;
        System.out.println("Cliente fez "+ listaCompras.size() + " Compras" );
        System.out.println(listaCompras.get(0).valorTotal());
        System.out.print("teste");

        for(Compra c : listaCompras){
            valorTotal += c.valorTotal();
        }

        System.out.print("E o total das compras foi de: " +valorTotal);

    }
    
}

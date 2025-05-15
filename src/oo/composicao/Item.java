package oo.composicao;

public class Item {
    double preco;
    int qt; 
    String nomeProduto;
    Compra compra;
       
    Item(String nome, int qt, double preco){
        this.nomeProduto = nome;
        this.qt = qt;
        this.preco = preco;
    }

}

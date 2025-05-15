package oo.composicao.desafio;

public class Item {
    Compra compra;
    Produto produto;
    int quantidade; 

    Item(Compra compra, Produto produto, int qtd){
        this.compra = compra;
        this.produto = produto;
        quantidade = qtd;

        produto.listaItens.add(this);
        compra.listaItens.add(this);
    }
}

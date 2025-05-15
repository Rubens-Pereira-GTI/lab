package oo.composicao.desafioComprav2;

public class Item {
    private Compra compra;
    private Produto produto;
    private int quantidade; 

    Item(String nomeProduto, int quantidade, double preco){        
        this.produto = new Produto(nomeProduto, preco);
        this.quantidade = quantidade;
        produto.addProduto(this);
    }

    void setCompra(Compra compra){
        this.compra = compra;
    }
    Produto getProduto(){
        return produto;
    }
    int getQuantidade(){
        return quantidade;
    }
}

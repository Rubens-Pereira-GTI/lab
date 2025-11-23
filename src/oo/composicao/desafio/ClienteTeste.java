package oo.composicao.desafio;
import oo.composicao.*;
//neste pequeno projeto trabalharemos o conceito de relacionamento entre classes
public class ClienteTeste {
    // o cliente pode efetuar várias compras no site
    //criar um cliente
    //criar duas compras
    // cada compra com dois itens
    static void main(String[] args) {
    Aluno a = new Aluno("r");
     
        Cliente cliente = new Cliente("Rubens");

        cliente.imprimirAlgo(cliente.nome);        
        //A compra tem uma lista de Itens
        Compra compra = new Compra(cliente);
        Compra compra2 = new Compra(cliente);

        // o produto também tem uma lista de itens
        Produto produto = new Produto("Escova de Cabelo", 4);
        Produto produto2 = new Produto("Creme dental", 10);
        Produto produto3 = new Produto("Chocolate", 2.5);
        //O Item conhece o produto e a compra e tem o atributo qtd
        Item item = new Item(compra, produto, 3);      

        Item item2 = new Item(compra, produto2, 2); 

        Item item3 = new Item(compra2, produto3, 1);

        //compra.valorTotal();
    
        //compra2.valorTotal();

        cliente.obterValorTotal();

        

        
        




    }
}

package oo.composicao.desafioComprav2;

public class ClienteTeste {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rubens");        
        
        Compra compra1 = new Compra(cliente);
        compra1.addCompra(new Item("Balão de Festa", 50, 1));
        compra1.addCompra(new Item("Velas", 2, 2.5));
        compra1.addCompra(new Item("Bolo", 1, 50));        

        Compra compra2 = new Compra(cliente);
        compra2.addCompra(new Item("Coca cola", 4, 10));
        
        cliente.obterValorTotal();

    }
}

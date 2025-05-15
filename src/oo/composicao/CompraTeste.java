package oo.composicao;

public class CompraTeste {
    
    public static void main(String[] args) {
        Compra c = new Compra();
        c.cliente="Marta";
        c.adicionarItem("caneta", 1, 1.5);
        c.adicionarItem("Borracha", 1, 3);
        c.adicionarItem("Caderno", 3, 11.90);

        System.out.println(c.listaItens.size());
        System.out.println(c.getValorTotal());
    
    }
}

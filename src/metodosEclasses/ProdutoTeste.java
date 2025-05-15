package metodosEclasses;

public class ProdutoTeste {
    
    public static void main(String[] args) {
        Produto produto = new Produto("notebook");

        //produto.setNome("Notebook");

        System.out.println(produto.getNome());
        System.out.println(produto.getDesconto());

        produto.setDesconto(.35);
        System.out.println(produto.getDesconto());
    }
}

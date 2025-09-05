package streams.DesafioRes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    
    public static void main(String[] args) {
        Produto p1 = new Produto("lapis", 1.99, 12, 30);

        Produto p2 = new Produto("Caderno", 15.50, 0.10, 25);
        Produto p3 = new Produto("Caneta Esferográfica", 2.75, 0.05, 15);
        Produto p4 = new Produto("Mochila Escolar", 89.90, 0.15, 40);
        Produto p5 = new Produto("Borracha", 0.99, 0.00, 10); // Sem desconto
        Produto p6 = new Produto("Apontador", 3.20, 0.08, 18);
        Produto p7 = new Produto("Computador", 1900.00, 0.35, 0);
        Produto p8 = new Produto("Impressora", 1200, 0.30, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);

        Predicate<Produto> superPromocao = p -> p.desconto >= 0.30;
        Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
        Predicate<Produto> prodRelevante = p -> p.preco >=500;

        Function<Produto, String> chamadaPromocional = p-> 
            "Aproveite "+ p.nome + " por R$" + p.preco;
 
        Consumer<String> imprimir = System.out::println;

        produtos.stream()
        .filter(superPromocao)
        .filter(freteGratis)
        .filter(prodRelevante).map(chamadaPromocional).forEach(imprimir);

        //System.out.println("Teste");

    }
}

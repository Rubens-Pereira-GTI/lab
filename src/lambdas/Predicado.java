package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Predicado {
    
    public static void main(String[] args) {
        Predicate<Produto> ehCaro =
            prod -> (prod. preco * (1 - prod.desconto)) >= 750;

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        
        Produto p1 = new Produto("Notebook", 3000.0, 0.15);
        System.out.println(ehCaro.test(p1));

        Produto p2 = new Produto("Notebook", 2750.05, .15);
        Produto p3 = new Produto("Caderno", 19.99, .5);
        Produto p4 = new Produto("Caneta", 2.5, .02);
        Produto p5 = new Produto("Lapis", 5, .05);

        List<Produto> listaProdutos = Arrays.asList(p1, p2, p3, p4, p5);

        listaProdutos.forEach(imprimir);
        listaProdutos.forEach(p -> System.out.println(p.preco));
        listaProdutos.forEach(System.out::println);

    }

}

package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio2 {
    // essa é a resolução do professor
    /*
     * 1. A partir do produto calcular o preço real (com desconto)
     * 2. Importo municipal: >= 2500 (8,5%)/ < 2500 (isento)
     * 3. Frete: >= 3000 (100)/ <3000(50)
     * 4. Arredondar: Deixar duas casas decimais
     * 5. Formatar: R$ 1234,56 
     */
    public static void main(String[] args) {
        Produto produto = new Produto("Ipad", 3235.89, 0.13);

        Function<Produto,Double> precoFinal = p -> (p.preco * (1 - p.desconto ));        
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco ;
        UnaryOperator<Double> calcFrete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = 
            preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", "."));
        Function<Double, String> formatar = 
            preco -> "R$"+ String.format("%,.2f", preco);

        String preco = precoFinal
            .andThen(impostoMunicipal)
            .andThen(calcFrete)
            //.andThen(arredondar)
            .andThen(formatar)
            .apply(produto);

        System.out.println(preco);
    }
    
}

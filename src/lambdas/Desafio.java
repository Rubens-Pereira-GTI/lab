package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("ipad", 3235.89, 0.13);
        
        /*
         * 1. A partir do produto calcular o preço real (com desconto)
         * 2. Importo municipal: >= 2500 (8,5%)/ < 2500 (isento)
         * 3. Frete: >= 3000 (100)/ <3000(50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$ 1234,56 
         */
        
        BinaryOperator<Double> precoComDesconto = (preco, desconto) -> (preco *(1 - desconto));
        Function<Double,Double> calcImposto = num -> num >= 2500 ? num*1.085 : num;    
        Function<Double,Double> calcFrete = num -> num >= 3000 ? num + 100 : num + 50;                
    
        Double resultado = precoComDesconto.apply(p.preco, p.desconto);
        resultado = calcImposto.apply(resultado);
        resultado = calcFrete.apply(resultado);

        System.out.println(String.format("%,.2f", resultado));

        System.out.println("\n Outra forma de fazer  \n");

        Double resultado2 = precoComDesconto.andThen(calcImposto).andThen(calcFrete).apply(p.preco, p.desconto);
        
        System.out.println(String.format("%,.2f", resultado));
    }
}

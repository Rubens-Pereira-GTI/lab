package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class OperadorBinario {
    
    public static void main(String[] args) {
        // No operador binario temos dois parametros do mesmo tipo
        // o retorno que também é do mesmo tipo. 
        BinaryOperator<Double> media = 
            (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(10.0,9.5));

        //na BiFunction temos dois parâmetros iguais e um retorno de tipo diferente
        
        BiFunction<Double, Double, String> resultado = 
            (n1, n2) -> ((n1 + n2) / 2 ) >= 7 ? "aprovado" : "reprovado";
        
        
        BiFunction<Double, Double, String> resultado2 = (n1, n2) -> {
            double notaFinal =  (n1 + n2) / 2 ; 
            return notaFinal >= 7 ? "aprovado" : "reprovado";
        };

        System.out.println(resultado.apply(9.7, 7.8));

        Function<Double, String> conceito = m -> m >= 7 ? "aprovado" : "reprovado";

        String resultado3 = media.andThen(conceito).apply(10.0, 7.0);
        System.out.println(resultado3);

    }   
}

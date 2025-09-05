package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        // 1- crie uma interface funcional Function 
        // recebe um int e retorna uma string
        // analisa se o int é par ou impar
        Function<Integer, String> parOuImpar = 
            num -> num % 2 == 0 ? "Par" : "Impar";

        //utilize a inteface funcional
        System.out.println(parOuImpar.apply(1));

        //crie uma interface funcional Function
        //receba uma String e retorne uma String

        Function<String, String> resultadoE = valor -> "O resultado é " +valor;
        
        Function<String, String> empolgado = valor -> valor + "!!!";

        // Crie uma composição de função com as duas funções criadas acima
        // crie uma String para receber a chamada da função
        String resultadoFinal = 
        parOuImpar
        .andThen(resultadoE)
        .andThen(empolgado)
        .apply(3);
        // Como é feito o fluxo? 
        // primeiro o método funcional principal é executado parOuImpart
        // depois os metodos andThen são executados em sequencia de chamada
        // resumindo 1ºparOuImpar 2º resultadoE 3ºempolado
        // obs, apesar de passarmos o argumento por ultimo ele irá ser usado fluxos das variáveis 

        System.out.println(resultadoFinal);

        String nome = null;
        String nome2;
        String nome3 = "";
        nome3.length();
        nome.length();
        nome.length();


        System.out.println("".equals(nome3));

    }


    
}

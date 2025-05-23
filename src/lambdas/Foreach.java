package lambdas;

import java.util.Arrays;
import java.util.List;
public class Foreach {
    
    

    public static void main(String[] args) {
        List<String> listaAprovados = Arrays.asList("Ana", "Bia", "Lia", "gui");

        // loop for aperfeçoado (foreach)
        for(String apro : listaAprovados){
            System.out.print(apro +", ");
        }
        
        listaAprovados.forEach((nome) -> {System.out.print(nome + "!!!");});

        listaAprovados.forEach(nome -> System.out.println(nome + "! "));

        listaAprovados.forEach(System.out::println);

        listaAprovados.forEach(
            nome -> meuMetodo("Rubens")
            );

    }

    static void meuMetodo(String nome){
        System.out.println("Oi, meu nome é "+ nome);
    }
    
   
}

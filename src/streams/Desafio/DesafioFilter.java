package streams.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    /* 
    criar duas interfaces funcionais para utilizar no filter
    crie 1 interface funcional para utilizar em um map no 
    final do encadeamento.    
    */ 

    public static void main(String[] args) {
        
        List<Usuario> usuarios = Arrays.asList(
            new Usuario("João", "D"),
            new Usuario("Rubens", "d"),
            new Usuario("Carlos", "D"),
            new Usuario("Barreto", "D"),
            new Usuario("Ryan", "E")
            );
        
        Predicate<Usuario> isPiloto = p -> p.papel.equals("piloto");
        
        Predicate<Usuario> qualificado= p -> p.ranking.toUpperCase().equals("D");

        Function<Usuario, String> resultado = u -> u.nome;

        Consumer imprimir = System.out::println;

        usuarios.stream().filter(isPiloto).filter(qualificado).map(resultado).forEach(imprimir);

        



    }
}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MapL {
    
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas= Arrays.asList("bmw", "Audi", "Honda");
        
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);
        
        UnaryOperator<String> maiuscula = m -> m.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+ n.toLowerCase().substring(1, n.length());
        UnaryOperator<String> grito = n -> n + "!!!";

        System.out.println("\nUsando Composição");
        marcas.stream()
        .map(Utilitario.maiuscula)
        .map(primeiraLetra)
        .map(Utilitario::grito)
        .forEach(print);

        
         
    }
}

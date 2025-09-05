package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    
    public static void main(String[] args) {
        
        // método que será utilizado na Stream Terminal Ops
        Consumer<String> print = System.out::print;
       
        //Criando um fluxo Build Ops
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        
        //Fazendo uma loop  Intermediate ops
        langs.forEach(print);

        //Aqui ainda não estamos criando a Stream, estamos apenas colocando os dados em um Array       
        String[] maisLangs = {"Phyton ","Lisp ", "Perl ", "Go\n"};
        
        //Estamos fazendo tudo na mesma linha Build ops, Intermediate ops e Terminal ops
        Stream.of(maisLangs).forEach(print);

        //Arrays.stream é a maneira preferêncial para se criar uma stream a partir de um array existente
        Arrays.stream(maisLangs).forEach(print);

        //essa é uma maneira de delimitar até onde vai o for na lista
        Arrays.stream(maisLangs, 1, 3).forEach(print);

        //criando uma lista através de uma classe List
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        
        // utilizando a lista do tio List e fazendo o fluxo da stream:
        // build ops, intermediate ops e terminal ops
        outrasLangs.stream().forEach(print);

        //criando uma Stream paralela através da lista do tipo List
        outrasLangs.parallelStream().forEach(print);

        //utilize o método generate da classe Stream para gerar um a de forma infinita
        // Dica: esse método utiliza um function interface Supplier 
        //Stream.generate(() -> "a" ).forEach(print);

        Consumer<Integer> println = System.out::println;
        //utilize o iterate da classe Stream para gerar uma iteração infinita  
        //dica: Stream.iterate(seed, UnaryOperator<T>)       
        Stream.iterate(0, n -> n + 1).forEach(println);

        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");

        nomes.stream().forEach(print);
    }
}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Rubens", 9.5);
        Aluno a2 = new Aluno("Ana", 7.5);
        Aluno a3 = new Aluno("Kleuber", 7);
        Aluno a4 = new Aluno("Joana", 7.4);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> mensagem = a -> "Parabéns, " + a.nome + ", você foi aprovado";
        
        alunos.stream()
        .filter(a -> a.nota >= 7)
        .map(a -> "Parabéns, "+ a.nome + ", você foi aprovado!")
        .forEach(System.out::println);

        // primeiro o resultado foi filtrado e depois colocado a mensagem
    }
}

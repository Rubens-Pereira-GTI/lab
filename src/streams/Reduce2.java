package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Rubens", 7);
        Aluno a2 = new Aluno("Jose", 5);
        Aluno a3 = new Aluno("Ana", 10);
        Aluno a4 = new Aluno("Jojo", 8);
        Aluno a5 = new Aluno("Jotaro", 9);
        Aluno a6 = new Aluno("Joseph", 9.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> somatorio = (a, b) -> a+b;

        alunos.stream()
        .filter(aprovado)
        .map(apenasNota)
        .reduce(somatorio)
        .ifPresent(System.out::println);

        double resultado=alunos.stream()
        .filter(aprovado)
        .map(apenasNota)
        .reduce(somatorio)
        .get();

        System.out.println(resultado);

        





    }
}

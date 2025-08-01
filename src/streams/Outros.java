package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Rubens", 7);
        Aluno a2 = new Aluno("Jose", 7);
        Aluno a3 = new Aluno("Ana", 7);
        Aluno a4 = new Aluno("Jojo", 8);
        Aluno a5 = new Aluno("Jotaro", 9);
        Aluno a6 = new Aluno("Joseph", 9.5);
        Aluno a7 = new Aluno("Rubens", 7);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);

        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(7)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        alunos.stream()
                .distinct()
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);
    }
}

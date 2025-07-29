package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Rubens", 7);
        Aluno a2 = new Aluno("Jose", 7);
        Aluno a3 = new Aluno("Ana", 10);
        Aluno a4 = new Aluno("Jojo", 8);
        Aluno a5 = new Aluno("Jotaro", 9);
        Aluno a6 = new Aluno("Joseph", 9.5);
        
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        //atáves do metodo match podemos dizer se todos, nenhum ou alguns alunos foram aprovados
    
        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));


        System.out.println(alunos.stream().noneMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado.negate()));

        Predicate<Aluno> reprovado = aprovado.negate();
        System.out.println(alunos.stream().noneMatch(reprovado));

    }
}

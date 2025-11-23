package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class MinMax {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Rubens", 7);
        Aluno a2 = new Aluno("Jose", 7);
        Aluno a3 = new Aluno("Ana", 10);
        Aluno a4 = new Aluno("Jojo", 8);
        Aluno a5 = new Aluno("Jotaro", 9);
        Aluno a6 = new Aluno("Joseph", 9.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Comparator<Aluno> melhorNota = (al1, al2) -> {
            if (al1.nota > al2.nota)
                return 1;
            if (al1.nota < al2.nota)
                return -1;
            // se for o mesmo numero retorna 0
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota));
        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
        
        

    }
}

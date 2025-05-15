package arrays_collections;

import java.util.ArrayList;

public class Curso {
    String nome;

    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    //construtores
    Curso(String nome){
        this.nome = nome;
    }

    void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    
}

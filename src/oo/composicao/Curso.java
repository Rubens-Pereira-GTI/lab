package oo.composicao;

import java.util.ArrayList;

public class Curso {
    String nome;
    ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();  

    void addAlunoNoCurso(Aluno aluno){
        listaAlunos.add(aluno);
        aluno.addAluno(this);
    }

    Curso(String nomeCurso){
        nome = nomeCurso;
    }

    public String getNome( ){
        return nome;
    }

    public String toString() {
        // TODO Auto-generated method stub
        return nome;
    }
}

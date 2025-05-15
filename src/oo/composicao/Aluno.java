package oo.composicao;

import java.util.ArrayList;

public class Aluno {
    String nome;
    ArrayList<Curso> listaCurso = new ArrayList<Curso>();
    void addAluno(Curso c){
            listaCurso.add(c);
        }
    
    
    Aluno(String nomeAluno){
        nome = nomeAluno;
    }

   

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nome;
    }


}

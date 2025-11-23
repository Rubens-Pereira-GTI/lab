package arrays_collections;

import java.util.ArrayList;

public class Aluno {    
    String nome;

    ArrayList<Curso> cursos = new ArrayList<Curso>();
    
    //construtores
    Aluno(String nome){
        this.nome = nome;
    }

    // metodo que adiciona um objeto curso a lista cursos
    // vai vincular o aluno a lista alunos da classeCurso
    void addCurso(Curso curso){
        cursos.add(curso);
        curso.addAluno(this);
    }

    boolean comparar(String nome2){
        return nome.equals(nome2);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("aloisio");
        //Aluno aluno2 = new Aluno("Rubens");

        boolean teste = aluno1.comparar("Rubens");
        System.out.println(teste);
    }

}

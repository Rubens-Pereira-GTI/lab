package arrays_collections;

import java.util.ArrayList;

public class CursoTeste {
    
    public static void main(String[] args) {

        Aluno[] a = new Aluno[3];
        a[0] = new Aluno("Joelma");
        a[1] = new Aluno ("Chimbinha");
        a[2] = new Aluno("Carla");

        Curso[] c = new Curso[4];
        c[0] = new Curso("Canto");
        c[1] = new Curso("Macho alfa");
        c[2] = new Curso("Empoderamento Feminino");
        c[3] = new Curso("Dança");

        a[0].addCurso(c[2]);
        a[0].addCurso(c[3]);

        a[1].addCurso(c[0]);
        a[1].addCurso(c[1]);
        a[1].addCurso(c[3]);

        a[2].addCurso(c[0]);
        a[2].addCurso(c[1]);
        a[2].addCurso(c[2]);
        a[2].addCurso(c[3]);
       
        
        for(int i=0; i< a.length; i++){
            System.out.println(a[i].nome +"------");

            for(int y=0; y< a[i].cursos.size(); y++  ){
                System.out.println(a[i].cursos.get(y).nome);
            }
    
        }
        System.out.println();
        for(int i=0; i< c.length; i++){
            System.out.println(c[i].nome +"------");

            for(int y=0; y< c[i].alunos.size(); y++  ){
                System.out.println(c[i].alunos.get(y).nome);
            }
    
        }
        
        
    }
}

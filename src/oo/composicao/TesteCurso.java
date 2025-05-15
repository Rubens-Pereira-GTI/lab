package oo.composicao;

public class TesteCurso {
    
    
    public static void main(String[] args) {

        Curso cDanca = new Curso("Dança");
        Curso cCanto = new Curso("Canto");
        Curso cAlfa = new Curso("Seja um Alfa");
        
        Aluno a1 = new Aluno("Joelma");
        Aluno a2 = new Aluno("Chimbinha");
        Aluno a3 = new Aluno("Carla");

        cDanca.addAlunoNoCurso(a1);
        cDanca.addAlunoNoCurso(a2);
        cDanca.addAlunoNoCurso(a3);

        cCanto.addAlunoNoCurso(a3);
        cCanto.addAlunoNoCurso(a1);

        cAlfa.addAlunoNoCurso(a2);      

        System.out.println(cDanca.getNome());
        System.out.println(cDanca.listaAlunos);
        
        System.out.println("\n"+cCanto.nome);
        System.out.println(cCanto.listaAlunos);

        //System.out.println(cDanca.listaAlunos.get(0).nome);

        System.out.println(cDanca.listaAlunos);

        System.out.println(cCanto.listaAlunos.get(0).listaCurso);
        System.out.println(a1.listaCurso);

        


    }
}

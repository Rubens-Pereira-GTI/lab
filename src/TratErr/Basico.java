package TratErr;

import java.io.EOFException;

public class Basico {
    public static void main(String[] args) {
        Aluno a1 = null;

        try {
            Basico.gerarErro2();
        } catch (Exception e) {
            // TODO: handle exception
        }

        Basico.gerarErro1();

        try{
            Basico.imprimirNomeAluno(a1);
        }catch(Exception ex){
            ex.printStackTrace();
        }

        

    }

    public static void imprimirNomeAluno(Aluno a){
        System.out.println(a.nome);
    }

    static boolean teste = true;
    static void roupas() throws Exception{
        
        if (teste){
            throw new Exception();
        }
    }

    static void gerarErro1(){
        throw new RuntimeException();
    }

    static void gerarErro2() throws Exception{
        throw new Exception();
    }
}

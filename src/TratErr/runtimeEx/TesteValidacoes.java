package TratErr.runtimeEx;

import TratErr.Aluno;

public class TesteValidacoes {    
    public static void main(String[] args){
        Aluno aluno = new Aluno("", -7);
        try{
            Validar.aluno(aluno);
        }catch(StringVaziaException ex){
            System.out.println(ex.getMessage());
        }catch(NumeroNegativoException | IllegalStateException ex){
            ex.getMessage();
        }      
        System.out.println(aluno.nome+" validado");
    }
}

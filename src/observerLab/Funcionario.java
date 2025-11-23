package observerLab;

public class Funcionario implements ChegadaObserver{

    String nome;

    @Override
    public void chegouEvent(ChegadaFuncionarioEvent event) {
        System.out.println(event.getDate());
    
    }


}

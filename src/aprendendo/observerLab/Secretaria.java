package aprendendo.observerLab;

public class Secretaria implements ReuniaoObserver {
    @Override
    public void chegou(String nome, ReuniaoEvent event){
        System.out.println(nome +" chegou as "+ event.horarioDaChegada() );
    }
}

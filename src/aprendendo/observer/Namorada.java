package aprendendo.observer;

public class Namorada implements ChegadaAniversarianteObserver{

    @Override
    public void chegou(ChegadaAniversarianteEvent event){
        System.out.println(event.getHoraDaChegada());
        System.out.println("Apagar as luzes");
        System.out.println("fazer silêncio");
        System.out.println("surpresa");
    }
    
}

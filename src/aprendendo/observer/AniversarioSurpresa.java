package aprendendo.observer;

public class AniversarioSurpresa {
    
    public static void main(String[] args) {
        Namorada eventObjectNamorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.addChegadaAniversarianteObserver(eventObjectNamorada);
        porteiro.start();
    }
}

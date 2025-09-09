package aprendendo.observerLab;

public class Reuniao {
    
    public static void main(String[] args) {
        Recepicionista recepicionista = new Recepicionista();
        Secretaria secretaria = new Secretaria();
        recepicionista.addReuniaoObserver(secretaria);

        recepicionista.start();
    }
}

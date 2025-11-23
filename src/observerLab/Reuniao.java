package observerLab;

public class Reuniao {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Recepicionista recepicionista = new Recepicionista();

        recepicionista.addFuncionarioObserver(funcionario);
    }
}

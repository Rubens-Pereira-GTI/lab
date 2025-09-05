package metodosEclasses.DesafioModulo;

public class Jantar {
    
    public static void main(String[] args) {
        Comida comida = new Comida("Omelete", 0.150);
        Pessoa pessoa = new Pessoa("Rubens", 84);
        Pessoa p2 = new Pessoa("Goku", 71);
        Comida c2 = new Comida("Strogonoff", 5.3);
        
        pessoa.apresentar();
        pessoa.comer(comida);
        pessoa.apresentar();

        p2.apresentar();
        p2.comer(c2);
        p2.apresentar();

        
    }
}

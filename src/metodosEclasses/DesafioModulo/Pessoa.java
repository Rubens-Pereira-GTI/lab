package metodosEclasses.DesafioModulo;

public class Pessoa {
    private String nome;
    private double peso;

    public Pessoa(String nome, double peso){
        this.nome=nome;
        this.peso=peso;
    }

    public void comer(Comida c){
        peso += c.getPeso();
    }

    public void apresentar(){
        System.out.printf("O %s pesou %,.1f kg.\n", 
        nome, peso);
    }

    public String getNome(){
        return nome;
    }
    public double getPeso(){
        return peso;
    }
}

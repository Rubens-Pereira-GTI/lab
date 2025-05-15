package metodosEclasses.DesafioModulo;

public class Comida {
    private String nome;
    private double peso;

    public Comida(String nome, double p){
        this.nome = nome;
        peso = p;
    }

    public double getPeso(){
        return peso;
    }

    public String getNome(){
        return nome;
    }
}

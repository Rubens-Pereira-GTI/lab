package oo.polimorfismo;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida){
        peso += comida.getPeso();
    }
    public String getNome() {
        return nome;
    }
    public double getPeso() {
        return peso;
    } 

    
}

package metodosEclasses;

public class Produto {
    private double preco;
    private String nome;
    private static double desconto=.25;

    //construtores
    public Produto(){

    }
    public Produto(String nomeInicial){
        nome = nomeInicial;
    }
    public Produto(String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco= precoInicial;
        desconto = descontoInicial;
    }
    //metodos seters 
    public void setPreco(float p){
        preco= p;
    }
    public void setNome(String n){
        nome = n;
    }
    public void setDesconto(double d){
        desconto = d;
    }

    //metodos getters 
    public double getPreco(){
        return preco;
    }
    public double getDesconto(){
        return desconto;
    }
    public String getNome(){
        return nome;
    }

    double precoComDesconto() {
        return preco * (1 - (desconto));
}

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - (desconto + descontoDoGerente));
    }



    




}

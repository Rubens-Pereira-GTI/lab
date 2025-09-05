package oo.herenca.Desafio;

public class Carro {
    int velocidadeAtual;    
    int velocidadePadrao=3;
    boolean ligar=false;
    final int VELOCIDADE_MAXIMA;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    
    void acelerar(){ 
        if(velocidadeAtual +5 > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
            System.out.println("Velocidade maxima atingida");
        }else{
            velocidadeAtual += velocidadePadrao;
            System.out.println(velocidadeAtual);
        }
    }

   
    void frear(){
        if(velocidadeAtual < 5){
            velocidadeAtual = 0;
            System.out.println(velocidadeAtual+"Teste");
        }else{
            velocidadeAtual -= 3;
        }
        
        System.out.println(velocidadeAtual);
    }
}

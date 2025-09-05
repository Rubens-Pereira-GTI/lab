package oo.herenca.Desafio;

public class Ferrari extends Carro {
    int velocidadePadrao = 10;
    Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
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
            System.out.println("Carro parado");
        }else{
            velocidadeAtual -= velocidadePadrao + velocidadePadrao;
            System.out.println(velocidadeAtual);
        }
        
        
    }
    
}

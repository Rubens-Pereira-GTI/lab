package oo.herenca.Desafio;

public class Fiat extends Carro{    
    int velocidadePadrao=5;
    //final int VELOCIDADE_MAXIMA;

    Fiat(int velocidadeMaxima){          
        super(velocidadeMaxima);
    }
   
   
   void acelerar(){ 
        if(!ligar){
            ligar=true;
            System.out.println("carro está ligado");
            velocidadeAtual = velocidadePadrao;
            System.out.println(" "+ velocidadeAtual);
        }else if(velocidadeAtual<=0){
            velocidadeAtual=0;
            ligar=false;
            System.out.println("Carro está desligado");
        }else{
            velocidadeAtual += velocidadePadrao;
            System.out.println(velocidadeAtual);
        }      
        
    }
}

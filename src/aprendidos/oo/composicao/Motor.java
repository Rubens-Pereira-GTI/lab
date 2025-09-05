package oo.composicao;

public class Motor {
    Carro carro;
    
    double fatorInjecao = 1; 
    boolean ligado = false;    
    
    
    Motor(Carro carro){
        this.carro = carro;
    }
  
    public double rpm(){
        if(!ligado){
            return 0;
        }else{
            return (int) fatorInjecao * 3000;
        }
    }
}

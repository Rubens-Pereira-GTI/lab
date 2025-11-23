package oo.composicao;

public class Carro {
    Motor motor = new Motor(this); 

    Carro(){
        motor = new Motor(this);
    }    
    
    public void acelerar(){
        motor.fatorInjecao += 0.4;
    }
    public void frear(){
        motor.fatorInjecao -=0.4;
    }
    public void ligar(){
        motor.ligado= true;
    }
    public void desligar(){
        motor.ligado= false;
    }

    public boolean estaLigado(){
        return motor.ligado;
    }

    public void teste(){
        motor.carro=this;
    }
}

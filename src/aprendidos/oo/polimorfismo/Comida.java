package oo.polimorfismo;

public abstract class Comida {
    private double peso;
    Comida(double peso){
        if(peso>0){
            this.peso=peso;
        }else{
            this.peso=0;
        }
        
    }
   

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso){
        if(peso>0){
            this.peso=peso;
        }
    }

    

}

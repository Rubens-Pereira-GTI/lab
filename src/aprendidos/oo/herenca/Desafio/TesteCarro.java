package oo.herenca.Desafio;

public class TesteCarro {
    
    public static void main(String[] args) {
        Carro carro = new Carro(120);                
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        
        Ferrari ferrari = new Ferrari(300);
        System.out.println("ferrari");
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();        

        Fiat fiat = new Fiat(180);
        System.out.println("Fiat");
        fiat.acelerar();
        fiat.acelerar();
        fiat.acelerar();
        fiat.acelerar();

    }

}

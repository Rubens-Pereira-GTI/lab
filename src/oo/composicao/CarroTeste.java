package oo.composicao;

public class CarroTeste {
    
    public static void main(String[] args) {
        
        Carro c = new Carro();
        c.ligar();
        System.out.println(c.estaLigado());
        System.out.println(c.motor.rpm());

        c.acelerar();
        System.out.println(c.motor.rpm());
        c.motor.carro.motor.carro.motor.rpm();
    }
}

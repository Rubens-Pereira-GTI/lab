package fundamentos;

import java.util.Scanner;

public class CalculadoraIMC {
    // programa pega o peso e a altura e calcula o imc 
    double peso;
    double altura;
    double imc;
    
    public double calculadora(){        
        //imc = peso / ((altura/100) * (altura/100)); 
        imc = peso / Math.pow(altura/100, 2);
        return imc;
    }

    public void userDados(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        altura = scan.nextDouble();
        System.out.println("Informe seu peso: ");
        peso = scan.nextDouble();     
        scan.close(); 
    }

    public void go(){
        userDados();
        double imc = calculadora();
        System.out.print("Seu imc atual é "+ imc+"\n");

    }

    public static void main(String[] args) {
        CalculadoraIMC imc = new CalculadoraIMC();
        imc.go();
    }

}

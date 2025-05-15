package fundamentos;

import java.util.Scanner;

public class CalcCubo {
    // Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
    int num;

    public void go(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero");
        num = scan.nextInt();
        scan.close();

        System.out.println("esté é ao quadrado: "+ Math.pow(num, 2));
        System.out.println("Este é o valor ao cubo: "+ Math.pow(num, 3));        
    }

    public static void main(String[] args) {
        CalcCubo calc = new CalcCubo();
        calc.go();
        
    }
}

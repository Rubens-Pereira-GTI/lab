package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    //ler num1
    // ler num2
    // usuário ipunt: + - * / %

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Num1:");
        float num1 = scan.nextFloat();
        System.out.println("num2:");
        float num2 = scan.nextFloat();
        System.out.println("informe a operação: + - * / % ");
        scan.nextLine();
        String inputUser = scan.next();  
        scan.close();
        double resultado = inputUser.equals("+") ? num1 + num2 : 0;
        resultado = inputUser.equals("-") ? num1 - num2 : resultado;
        resultado = inputUser.equals("*") ? num1 * num2 : resultado;
        resultado = inputUser.equals("/") ? num1 / num2 : resultado;
        resultado = inputUser.equals("%") ? num1 % num2 : resultado;
        
        System.out.printf("Calculando: %,.2f %s %,.2f = %,.2f", num1, inputUser, num2, resultado );
        
    }
}

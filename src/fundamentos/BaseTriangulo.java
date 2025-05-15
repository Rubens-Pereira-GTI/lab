package fundamentos;

import java.util.Scanner;

public class BaseTriangulo {
    double base, altura, area;

    public void calc(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a base:");
        base = scan.nextDouble();
        System.out.print("Informe a altura:");
        altura = scan.nextDouble();
        scan.close();
        area = (base * altura) / 2;

        System.out.println("A area do triangulo é: "+ area);
    }

    public static void main(String[] args) {
        BaseTriangulo bt = new BaseTriangulo();
        bt.calc();
    }
}

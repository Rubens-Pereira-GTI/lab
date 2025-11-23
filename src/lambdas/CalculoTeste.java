package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste {
    
    public static void main(String[] args) {
        BinaryOperator<Integer> calc = (x , y) -> {return x + y;};
        int resultado = calc.apply(3, 3);
        System.out.println(resultado);
        
        //Calculo soma = new Soma();
        //Calculo multiplicacao = new Multiplicar();

        //System.out.println(soma.executar(2,2));
        //System.out.println(multiplicacao.executar(3, 2));

        Calculo soma = (x, y) -> x+y;
        


    }
}

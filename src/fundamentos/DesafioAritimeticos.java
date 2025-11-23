package fundamentos;

public class DesafioAritimeticos {
    // desafio é criar uma expressão matematica dividindo ela em partes e 
    //ir salvando as partes dos resultados em variáveis
    public static void main(String[] args) {
        double p1, p2, p3, resultFinal ;
        double p1Ex, p2Ex, p3Ex, p4Ex;
        
        
        p1=(6*(3+2));
        p1Ex = Math.pow(p1, 2);
        p1 = p1Ex / (3*2);
        System.out.println(p1);

        p2 = ((1-5)*(2-7)/2);
        p2Ex = Math.pow(p2, 2);
        p2= p2Ex;

        System.out.println(p2);
        p3 = (p1 - p2);
        System.out.println(p3);

        p3Ex = Math.pow(p3, 3);
        p4Ex = Math.pow(10, 3);

        resultFinal = p3Ex / p4Ex;

        System.out.println(resultFinal);


        

    }
}

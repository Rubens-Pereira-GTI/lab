package streams;

import java.util.function.UnaryOperator;

public class Utilitario {

    public static UnaryOperator<String> maiuscula = n -> 
        n.toUpperCase();

    public static UnaryOperator<String> primeiraLetra = 
    n -> 
    n.charAt(0) + 
    n.substring(1, n.length());

    public static String grito(String n){
        return n+"!!!";
    }
    
    public static void main(String[] args) {
        
    }
}

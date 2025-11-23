package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * 1. Número para string binária ... 6 => "110"
 * 2. inverter a String... "110" => "011"
 * 3. Converter de volta para inteiro => "011" = 3
*/

/**
 * @
 * 
 * 
 */

public class DesafioMap {
    
    public static void main(String[] args) {
       
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Consumer imprimir = System.out::println;
        
        
        Function<Integer, String> intParaBinario = num -> Integer.toBinaryString(num);
        
        UnaryOperator<String> binaryInverter = binVal -> new StringBuilder(binVal).reverse().toString();

        Function<String, Integer> binParaInt = binVal ->  Integer.parseInt(binVal);
        

        System.out.println("Convertido em binário");
        nums.stream().map(intParaBinario).forEach(imprimir);

        System.out.println("\n Ordem binaria invertida");
        nums.stream().map(intParaBinario).map(binaryInverter).forEach(imprimir);
        
        System.out.println("\n Novos numeros");
        nums.stream().map(intParaBinario).map(binaryInverter).map(binParaInt).forEach(imprimir);;

        // poderia ter feito tudo em uma uncia linha mas resolvi ser reduntante para fins de estudo
    }

    /*
     * segue agora o jeito que o professor resolveu ele o operador de referência
     * e isso deixou o código mais prático.
     * Achei interessante que a minha resolução foi quase idêntica nas escolhas das 
     * interfaces funcionais o que mostra a boa compreenção que tive sobre elas
     */

     void professorWay(){
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Consumer imprimir = System.out::println;

        UnaryOperator<String> binaryInverter = binVal -> new StringBuilder(binVal).reverse().toString();
        
        Function<String, Integer> binParaInt = binVal -> Integer.parseInt(binVal, 2);

        nums.stream()
            .map(Integer::toBinaryString)
            .map(binaryInverter)
            .map(binParaInt)
            .forEach(System.out::println);

     }
    
}

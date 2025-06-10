package lambdas;
import java.util.function.Predicate;

public class PredicadoComposicao {
    
    public static void main(String[] args){

// faça código utilizando o predicate que diga se um numero é par e o tipo do retorno é um boolean
        Predicate<Integer> isPar = num -> num % 2 == 0;
// faça um código utilizando o Predicate que diga se o numero tem 3 digitos e retorne um boolean
        Predicate<Integer> isTresDigitos = 
            num -> num >= 100 && num <= 999;
//utilize os códigos acima de maneira encadeada 
        System.out.println(isPar.and(isTresDigitos).test(121));
// utilize o método negate para negar o códig de cima
        System.out.println(isPar.and(isTresDigitos).negate().test(121));
// utilize o operador lógico OU ao inves de E
        System.out.println(isPar.or(isTresDigitos).test(121));

        //como o predicate retorna um boolean só podemos encadear só podemos 
        //encadear funções que trabalhem com operadores lógicos. 

    }
}

package streams;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Teste {
    private int num;

    void t1(int n){
        num = n;
    }
       

    public static void main(String[] args) {
     
        Teste a = new Teste();// 1365148613614485
        Teste b = new Teste();// 1351511611

        Predicate<Integer> isPar = num -> num % 2 == 0;

        a.t1(2);

        System.out.println(isPar.test(1));
        //System.out.println(a.num + " " + b.num);    

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        Consumer<String> imprimir = System.out::print;

        langs.forEach(imprimir);
        
    }


}

package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    
   void go(){
        //crie uma lista do tipo List tipado com String em seguida ensira 
        //três nomes na lista. 
        List<String> aprovados = Arrays.asList("Rubens", "Edna", 
        "Bruno", "Josaphat");

        //imprima a lista de nomes 
        for(String n : aprovados){
            System.out.println(n);
        }

        comIterator(aprovados);
        comStream(aprovados);
    }

    void comIterator(List<String> apList){
        //utilize o iterator em um loop while 
        Iterator<String> it = apList.iterator();
        while(it.hasNext()){ 
            //imprima a string da vez 
            System.out.println(it.next());
        }
        
    }

    void comStream(List<String>apList){
        //crie um objeot stream que receba a lista
        Stream<String> stream = apList.stream();
        //faça um loop forEach utilizando Stream
        stream.forEach(System.out::println);

    }

    public static void main(String[] args) {
        ImprimindoObjetos imp = new ImprimindoObjetos();
        imp.go();
    }
}

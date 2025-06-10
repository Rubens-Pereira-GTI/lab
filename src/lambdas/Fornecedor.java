package lambdas;

import java.util.function.*;
import java.util.Arrays;
import java.util.List;

public class Fornecedor {    

    public static void main(String[] args) {
    //Essa interface não recebe nenhum parámetro e volta algo
        Supplier< List<String> > umaLista =
            () -> Arrays.asList("Anna", "Bia", "Lia", "Gui");
        
        System.out.println(umaLista.get());
        

    }
    
}

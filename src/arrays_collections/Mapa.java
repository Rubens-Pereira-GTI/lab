package arrays_collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    
    public static void main(String[] args) {

        Map<Integer, String> lista = new HashMap<Integer, String>();
        lista.put(1, "Rubens");
        lista.put(1, "Mariana falls");
        lista.put(23, "Joana de Angelis");
        lista.put(20, "Pedro");
        lista.put(3, "João");        

        System.out.println(lista.containsValue("João"));

        System.out.println(lista.entrySet());

        System.out.println(lista.keySet());
        System.out.println(lista.values());
        System.out.println(lista.get(1));
        
        for (Entry<Integer, String> nome : lista.entrySet() ){
                System.out.println(nome.getKey()+ " ==> "+ nome.getValue());
            }

    }
   

}

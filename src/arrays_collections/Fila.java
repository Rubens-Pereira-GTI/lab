package arrays_collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    
    public static void main(String[] args) {        

        Queue<String> fila = new LinkedList<>();
        fila.add("Anna");
        fila.offer("Bia");
        fila.offer("Adriana");


       String pool = fila.poll();
       String peek = fila.peek();

        System.out.println(pool);
        System.out.println(peek);
        System.out.println(fila.poll());
        
        
    }
}

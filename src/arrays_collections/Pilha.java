package arrays_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();

        deque.push("O pequeno principe");
        deque.push("Humilhados e ofendidos");        
        deque.push("a 2000 anos atrás");

        deque.offer("Paulo e Estevão"); 
        deque.offer("O Hobit");

                
        System.out.println(" - Elimidado"+deque.poll());
        System.out.println(deque.pollLast());
        //System.out.print("espiada -"+ deque.peek());        
        System.out.println("removido "+deque.remove());
        System.out.println("pop- "+deque.pop());


    }
}

package arrays_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetTeste {
    
    public static void main(String[] args) {
        Book b1 = new Book("O idiota");
        Book b2 = new Book("Humilhados e ofendidos");
        Book b3 = new Book("Crime e Castigo");
        
        List<Book> listaDesordenada = new ArrayList<Book>();
        listaDesordenada.add(b1);
        listaDesordenada.add(b2);
        listaDesordenada.add(b3);

        System.out.println(listaDesordenada);

        BookCompare bookCompare = new BookCompare();
        // pegue uma lista de livros ordene-a, utilize o bookCompare para dizer como se deve organizar.
        TreeSet<Book> listaDeLivrosOrdenada = new TreeSet<Book>(bookCompare);

        listaDeLivrosOrdenada.addAll(listaDesordenada);

        System.out.println(listaDeLivrosOrdenada);

    }
}

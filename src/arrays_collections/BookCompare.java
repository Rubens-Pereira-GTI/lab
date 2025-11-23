package arrays_collections;

import java.util.Comparator;

public class BookCompare implements Comparator<Book>{

    public int compare(Book b1, Book b2){
        return b1.getTitulo().compareTo(b2.getTitulo());
    }
    
}

package arrays_collections.jukebox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class JukeBox6 {

    public static void main(String[] args) {

        ArrayList<Song> sList = new ArrayList<Song>();
        HashSet<Song> songList = new HashSet<Song>();

        sList.add(new Song("Ouça o que digo"));
        sList.add(new Song("Não ouça ninguém"));
        sList.add(new Song("Ouça o que digo"));

        System.out.println(sList);

        Collections.sort(sList);

        System.out.println(sList);

        songList.addAll(sList);
        
        System.out.println(songList);
    }
}

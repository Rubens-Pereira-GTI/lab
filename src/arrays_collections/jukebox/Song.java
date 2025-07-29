package arrays_collections.jukebox;

public class Song implements Comparable<Song>{
    public String nome;

    public Song(String nome){
        this.nome = nome;    
    }

    public String toString() {
        return nome;
    }

    public int hashCode(){
        System.out.println("hash");
        return getNome().hashCode();
    }

    public boolean equals(Object song){
        Song s = (Song) song;
        return getNome().equals(s.getNome());
    }

    public int compareTo(Song o) {
        return nome.compareTo(o.nome);
    }

    public String getNome(){
        return nome;
    }

}

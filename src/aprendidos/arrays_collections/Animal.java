package arrays_collections;

public class Animal implements Comparable{
    String especie;

    public Animal(){

    }

    public Animal(String especie){
        this.especie = especie;
    }

    @Override
    public int compareTo(Object o) {        
        Animal a = (Animal) o;
        return especie.compareTo(a.especie);
        
    }

    public String toString(){

        return especie;
    }
   
}

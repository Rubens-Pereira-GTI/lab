package arrays_collections;

import java.util.TreeSet;

public class ArvorePreparada {
    //Para utilizar o TreeSet é necessário subscrever o método compareTo
    //na classe que será comparada. E para subscrever esse método é necessário 
    //implementar a interface Comparable

    
    public TreeSet<Animal> criarLista(TreeSet<Animal> listaAnimal){
        listaAnimal.add(new Animal("Caninos"));
        listaAnimal.add(new Animal("Felinos"));
        listaAnimal.add(new Animal("Repteis"));
        listaAnimal.add(new Animal("Insetos"));
        return listaAnimal;
    }
    public static void main(String[] args) {
        
        ArvorePreparada noe = new ArvorePreparada();
        
        TreeSet<Animal> listaAnimal = new TreeSet<Animal>();

        noe.criarLista(listaAnimal);  
        
        //agora o problema é que o método toString n retorna o nome da especie
        // precisamos subscrever ou utilizar um loop vamo fazer os dois
        System.out.println(listaAnimal.toString());

        //loop
        for(Animal animal : listaAnimal){
            System.out.println(animal);
        }
    }
}

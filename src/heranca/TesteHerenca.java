package heranca;

public class TesteHerenca {
    
    public static void main(String[] args) {
        Dog adog = new Dog();
        Animal aAnimal = adog;
        aAnimal.correr();

    }
}

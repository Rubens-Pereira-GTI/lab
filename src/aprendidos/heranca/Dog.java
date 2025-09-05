package heranca;

public class Dog extends Animal{
    
    public void correr(){
        System.out.println("correndo como um cachorro");
    }

    public static void main(String[] args) {
        Dog aDog = new Dog();

        Animal aAnimal = aDog;

        aAnimal.correr();
    }

}

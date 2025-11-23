package heranca;

public class Dog extends Animal{

    public Dog(){
        System.out.println("Dog Criado");
    }
    
    public void correr(){
        System.out.println("correndo como um cachorro");
    }

    public void latir(){
        System.out.println("uff, uff");
    }

    public static void main(String[] args) {
        new Dog();
    }

}

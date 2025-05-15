package oo.polimorfismo;

public class Jantar {
    
    public static void main(String[] args) {
        Comida arroz = new Arroz(.200);
        Comida feijao = new Feijao(.100);
        Pessoa p1 = new Pessoa("João", 80);
        Comida sorvete = new Sorvete(.3);

        System.out.println(p1.getNome()+" pesou "+p1.getPeso());
        p1.comer(feijao);
        p1.comer(arroz);
        System.out.println("Depois da janta ele ficou com: "+ p1.getPeso());
        p1.comer(sorvete);
        System.out.println("Comeu a sobremesa");
        System.out.println(p1.getPeso());
        
    }
}

package streams;

public class MediaTeste {
    public static void main(String[] args) {

        Media m1 = new Media().adicionar(8.3).adicionar(4.5);
        Media m2 = new Media().adicionar(9.5).adicionar(7.5);
        
        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combinar(m1, m2).getValor());
    }    
}
    

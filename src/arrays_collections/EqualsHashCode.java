package arrays_collections;

public class EqualsHashCode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome="Rubens";
        u1.email="rubens@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome="Rubens";
        u2.email="rubens@gmail.com";

        System.out.println( u1==u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

    }
}

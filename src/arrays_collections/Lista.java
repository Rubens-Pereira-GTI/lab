package arrays_collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        Usuario u1 = new Usuario("Adriana");

        lista.add(u1);
        lista.add(new Usuario("Bia", "Bia@gmail.com"));
        lista.add(new Usuario("Manu"));

        //System.out.println(lista.toString());
        //System.out.println(lista.get(0));

        System.out.println(lista.remove(0));
        
        System.out.println(lista.remove(new Usuario("Bia")));

        for(Usuario u: lista){
            System.out.println(u.nome);
        }

    }
}

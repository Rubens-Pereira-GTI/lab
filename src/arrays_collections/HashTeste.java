package arrays_collections;

import java.util.HashSet;

public class HashTeste {
    
    public static void main(String[] args) {
        
        HashSet<Usuario> lista = new HashSet<Usuario>();
        lista.add(new Usuario("Rubens"));
        lista.add(new Usuario("Cassia"));
        lista.add(new Usuario("Mariana"));
        lista.add(new Usuario("Adriana"));

        boolean resultado = lista.contains(new Usuario("Cassia"));

        System.out.println(resultado);
    }
}

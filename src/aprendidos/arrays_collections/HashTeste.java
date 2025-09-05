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

        //Na listas do Tipo HashSet, caso queiramos tratar dois objeto diferentes como iguais 
        //devemos sobrepor o método hashCod(), e o método equals().

        Object[] lis = lista.toArray();

        System.out.println(lis[0]);

        Curso a = new Curso("Inglês");
        System.out.println(a);

    }
}

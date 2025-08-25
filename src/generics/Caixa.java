package generics;

import java.util.List;

public class Caixa {
    
    String nome;

    Caixa(){}

    public Caixa(String nome){
        this.nome = nome;
    }

    static Object getUltimo(List<?> lista){
        return lista.get(lista.size() -1);
    }

    static Object getUtimo2(List<Object> lista){
        return lista.get(lista.size() -1);
    }
}

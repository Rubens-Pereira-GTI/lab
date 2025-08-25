package generics;

import java.util.ArrayList;
import java.util.List;

public class CaixaInt extends Caixa{

    CaixaInt(String nome){
        this.nome = nome;
    }
    
    
    public static void main(String[] args) {
        Caixa caixaA = new Caixa("Gato");
        CaixaInt caixaB = new CaixaInt("Controle");
        Caixa caixaC = new Caixa("Xbox");

        List<Caixa> lista = new ArrayList<Caixa>();
        lista.add(caixaA);
        lista.add(caixaB);
        lista.add(caixaC);
        
        List lista2 = new ArrayList<>();
        lista2.add(caixaA);

        Caixa caixa = lista.get(0);
        System.out.println(caixa.getClass()); 

        
        Object c = lista2.get(0);
        System.out.println(c.getClass());

        System.out.println(Caixa.getUltimo(lista));
        
        Caixa.getUtimo2(lista2);




    }
}

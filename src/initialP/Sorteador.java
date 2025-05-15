package initialP;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Sorteador {
    //Esse programa vai armazenar em uma matriz do tipo Hashmap id e peso
    // Em seguida vamos sortear utilizando os pesos para desbalancear o sorteio

    private int id, peso; 
    private int numSorteado;

    // esse metod vai armazenar a id do usuário e o peso para o sorteio
    public void setIdAndPoints(){
        HashMap<Integer, Integer>usuarios = new HashMap<Integer, Integer>();
        usuarios.put(1, 10);
        usuarios.put(2, 20);
        usuarios.put(3, 30);

        numSorteado(usuarios);

        System.out.println("Id do sorteado: "+ numSorteado);

    }

    public int numSorteado(HashMap<Integer, Integer>usuarios){

        int somaPesosU = 0;
        for(int usuario : usuarios.values()){
            somaPesosU = somaPesosU + usuario;
        }

        // sorteio da soma dos pesos 
        numSorteado = (int)(Math.random() * (somaPesosU+1));
        
        int acumulado = 0;
        //Vamos utilizar  a 
        for(Map.Entry<Integer, Integer> entry : usuarios.entrySet()){
            acumulado = acumulado + entry.getValue();

            if(numSorteado<=acumulado){
                numSorteado = entry.getKey();
                return entry.getKey();
            }
        }
         
        throw new RuntimeException("Erro no sorteio");
    }

    public static void main(String[] args) {
        Sorteador sorte = new Sorteador();
        sorte.setIdAndPoints();
    }
}

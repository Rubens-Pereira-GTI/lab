package aprendendo.observerLab;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/* 
vamos ter o metodo run aqui ele ficara rodando o tempo todo
*ele vai adicionar o observador a uma lista
vai dizer para o observer quando o evento acontecer passnado para ele o evento
*/ 

public class Recepicionista extends Thread{
    
    List<ReuniaoObserver> reuniaoObservers = new ArrayList<ReuniaoObserver>();

    Scanner scan = new Scanner(System.in);
    
    public void addReuniaoObserver(ReuniaoObserver observer){
        reuniaoObservers.add(observer);
    }

    public void run(){

        while (true) {
            System.out.println("informe o nome:");
            String nome = scan.nextLine();
            ReuniaoEvent reuniaoEvent = new ReuniaoEvent(new Date());
            if(nome.equalsIgnoreCase("rubens")){
                for(ReuniaoObserver observer : reuniaoObservers){
                    observer.chegou(nome, reuniaoEvent);
                }

            }
        }
        
    }
}

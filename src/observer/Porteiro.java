package observer;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread{
    
    private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();

    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer){
        this.observers.add(observer);
        this.start();
    } 

    
    @Override
    public void run(){
        
        

        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("informe o codigo");
            int valor = scan.nextInt();

            if(valor == 1){
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());
                
                for(ChegadaAniversarianteObserver observer : this.observers){
                    observer.chegou(event);
            }
            }else{
                System.out.println("Alarme falso");
                scan.close();
            }
            
        }
        
    }
}

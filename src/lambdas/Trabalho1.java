package lambdas;

public class Trabalho1 implements Runnable {
    
    public void run(){
        for(int i =0; i<100; i++){
            System.out.println("Tarefa 1");        
                try{
                Thread.sleep(100);
                }catch(Exception ex){
                
                }
        }
    }
}

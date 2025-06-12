package lambdas;

public class Threads {
    
    public static void main(String[] args) {
        
        //vamos utilizar o método que está na classe trabalho
        Runnable trabalho1 = new Trabalho1();

        //Vamos utilizar o método que está classe anônima
        Runnable trabalho2 = new Runnable() {            
            public void run(){
                for(int i =0; i<100; i++){
                    System.out.println("Tarefa 2");        
                    try{
                        Thread.sleep(100);
                    }catch(Exception ex){
                    }
                }
                
            }
        };

        //Vamos utilizar uma função lambda para o método runnable
        Runnable trabalho3 = () -> {
            for(int i =0; i<100; i++){
                    System.out.println("Tarefa 3");        
                    try{
                        Thread.sleep(101);
                    }catch(Exception ex){
                    }
                }
        };

        //utilizando o operador de referência
        Runnable trabalho4 = Threads::trabalho4;


        //instânciandos
        Thread t1 = new Thread(trabalho1);
        Thread t2 = new Thread(trabalho2);
        Thread t3 = new Thread(trabalho3);
        Thread t4 = new Thread(trabalho4);

        //colocando em estado de espera para a execução
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    
    }

    static void trabalho4(){
        for(int i =0; i<100; i++){
            System.out.println("Tarefa 4");        
            try{
                Thread.sleep(100);
            }catch(Exception ex){
            }
        }
    }
}

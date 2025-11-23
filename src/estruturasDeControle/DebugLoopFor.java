package estruturasDeControle;

public class DebugLoopFor {
    //vamos fazer um loop for dentro de outro e utilizar a ferramentar Debug para analisar o loop

    public static void main(String[] args) {
        
        for(int x=0; x<10; x++){
            System.out.println(x);
            for(int y =0; y<10; y++){
                System.out.printf("[%d %d]",y, x);
            }
        }
    }
}

package estruturasDeControle;

import javax.swing.JOptionPane;

public class GuessGame {
    
    public static void main(String[] args) {
        int guess=0;
        int numRandom=0;

        numRandom = (int) (Math.random() * 100);

        for(int i =0; i<10; i++){
            guess = Integer.parseInt(JOptionPane.showInputDialog("tente adivinhar o numero que estou pensando"));


            if(guess == numRandom){
                System.out.println("acertou!");
                break;
            }
        }
               

        

    }
}

package estruturasDeControle;

import javax.swing.JOptionPane;

public class VerificadorDeNum {
   
    public static void main(String[] args) {
        
        String input ;
        int num= 1;

        do{
            input = JOptionPane.showInputDialog("digite um numero entre 10 e 0: ");
            num = Integer.parseInt(input);        
        }while(num>10 || num<0);
        
        if(num%2 ==0){
            System.out.println("numero par");

        }else{
            System.out.println("numero impar");
        }

    }
}

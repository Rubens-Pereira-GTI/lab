package estruturasDeControle;

import javax.swing.JOptionPane;

public class Primo {
    
    public static void main(String[] args) {
        double num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        
        int cont=0;
        for(int i=1; num >= i; i++){
            //System.out.println(i);
            if(num%i==0){
                cont++;            
                System.out.println(num);
            }
        }
        System.out.println(cont);
        if(cont<=2){
            System.out.println("numero primo");
        }else{
            System.out.println("Não é primo");
        }
    }
}

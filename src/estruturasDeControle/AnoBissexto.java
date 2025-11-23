package estruturasDeControle;

import javax.swing.JOptionPane;

public class AnoBissexto {
    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));

        if(num%4==0 & (num%100!=0 || ( num%100==0 & num%400==0) ) ){
            System.out.println("ano bissexto");
        }else{
            System.out.println("ano não bissexto");
        }

    }
}

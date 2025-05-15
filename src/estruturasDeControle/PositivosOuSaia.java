package estruturasDeControle;

import javax.swing.JOptionPane;

public class PositivosOuSaia {
    
    public static void main(String[] args) {
        int num=0;
        while(num>=0){
            num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero positivo"));

        }
        System.out.println("Fim");

    }
}

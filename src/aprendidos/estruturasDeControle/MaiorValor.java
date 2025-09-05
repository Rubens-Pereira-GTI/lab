package estruturasDeControle;

import javax.swing.JOptionPane;

public class MaiorValor {
    
    public static void main(String[] args) {
        int num=0;
        int maior=0;

        for (int i=0; i<10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));

            if(num>maior){
                maior=num;
            }
        }

        System.out.println("Este foi o maior numero que já passou por aqui: "+maior);
    }
}

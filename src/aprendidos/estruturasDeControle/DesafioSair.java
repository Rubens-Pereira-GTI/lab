package estruturasDeControle;

import javax.swing.JOptionPane;

public class DesafioSair {
    //Enquanto o usuário não digitar sair o loop continuará
    // utilizaremos o while pois não sabemos ao certo quantos loops serão até
    // o usuário digitar sair
    String inputUsuario;

    public void loopWhile(){
        
        inputUsuario= JOptionPane.showInputDialog("Não escreva sair por favor! ");
        while(!inputUsuario.trim().equalsIgnoreCase("sair")){
            inputUsuario= JOptionPane.showInputDialog("Não escreva sair por favor! ");
        }
    }

    public void loopWhile2(){        
        do {
            inputUsuario= JOptionPane.showInputDialog("Não escreva sair por favor! ");                    
        }while(!inputUsuario.trim().equalsIgnoreCase("sair"));
        
    }
    


    public static void main(String[] args) {
        DesafioSair sair = new DesafioSair();
        sair.loopWhile2();
    }
}

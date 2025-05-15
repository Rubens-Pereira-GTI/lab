package estruturasDeControle;

import javax.swing.JOptionPane;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa="branca";

        faixa =JOptionPane.showInputDialog("Qual sua faixa?");
        faixa = faixa.toLowerCase().trim();
        switch (faixa) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Heian Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
        
            default:
                System.out.println("não sei nada");
                break;
        }
    }
}

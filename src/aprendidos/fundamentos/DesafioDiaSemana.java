package fundamentos;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
    // vai converte o numero por extenso em um numero
    // ex: quarta -> 4

    private String diaSemana;
    private int num;

    public void go(){
        diaSemana = JOptionPane.showInputDialog("Dia da semana:");
        if(diaSemana.equals("Domingo")){
            num=1;
        }else if(diaSemana.trim().toLowerCase().equals("segunda")){
            num=2;
        }else if(diaSemana.trim().toLowerCase().equals("terça")){
            num = 3;
        }else if(diaSemana.trim().toLowerCase().equals("quarta")){
            num=4;
        }else if(diaSemana.trim().toLowerCase().equals("quinta")){
            num=5;
        }else if(diaSemana.trim().toLowerCase().equals("sexta")){
            num= 6;
        }else if (diaSemana.trim().toLowerCase().equals("sábado") 
            || diaSemana.trim().equalsIgnoreCase("sabado")){
            num=7;
        }else{
            System.out.println("Algo deu errado");
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        DesafioDiaSemana dds = new DesafioDiaSemana();
        dds.go();
    }
}

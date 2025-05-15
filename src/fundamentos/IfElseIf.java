package fundamentos;

import java.util.Scanner;
import javax.swing.*;

public class IfElseIf {
    //Este código visa demonstrar como podemos ter multiplos ifs aninhados 
    private String num;
    double nota;
    public void go(){
        
        num = JOptionPane.showInputDialog("informe a nota:");
        nota = Integer.parseInt(num);

        if(nota<0 || nota>10){
            System.out.println("Nota invalida");            
        }else if(nota>=8.1){           
                System.out.println("nota A");                   
        }else if(nota>=6.1){            
                System.out.println("nota B");
        }else if(nota>=4.1){            
            System.out.println("nota C");
        }else if(nota>=2.1){            
            System.out.println("nota D");
        }else{
            System.out.println("nota E");
        }
    }

    public void go2(){
        num = JOptionPane.showInputDialog("informe a nota:");
        nota = Integer.parseInt(num);

        if(nota<0 || nota>10){
            System.out.println("Nota invalida");            
        }else{
            if(nota>=8.1){           
                System.out.println("nota A");
            }else{
                if(nota>=6.1){            
                    System.out.println("nota B");
                }else{
                    if(nota>=4.1){            
                        System.out.println("nota C");
                    }else{
                        if(nota>=2.1){            
                            System.out.println("nota D");
                        }else{
                            System.out.println("nota E");
                        }
                    }
                }
            }
        }
    }
    

    public void apenasIf(){
        num = JOptionPane.showInputDialog("informe a nota:");
        nota = Integer.parseInt(num);
        //O problema dessa forma é que se o aluno tirar nota 9 todos os ifs serão impressos pois todos são verdade
        if(nota<0 || nota>10){
            System.out.println("Nota invalida");            
        }if(nota>=8.1){           
                System.out.println("nota A");                   
        }if(nota>=6.1){            
                System.out.println("nota B");
        }if(nota>=4.1){            
            System.out.println("nota C");
        }if(nota>=2.1){            
            System.out.println("nota D");
        }else{
            System.out.println("nota E");
        }
    }
        

    

    public static void main(String[] args) {
        IfElseIf g = new IfElseIf();
        g.go();
    }

}

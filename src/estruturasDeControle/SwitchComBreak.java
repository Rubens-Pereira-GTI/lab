package estruturasDeControle;

import java.util.Scanner;

public class SwitchComBreak {

    public void continueTeste(){
        for(int i=0; i<10; i++){

            if( i% 2 == 1){
                break;
            }

            System.out.println(i);
        }
    }

    public void breakInterno(){

    externo:    for(int i=0; i<3;i++){
            for(int y=3; y<3; y++){

        interno:   if(i==1){
                    break externo;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String conceito="";

        System.out.print("Informe a nota: ");
        int nota = scan.nextInt();

        switch (nota) {
            case 10: case 9: 
                conceito="A";
                break;
        
            default:
                break;
        }

    }
}   

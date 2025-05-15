package estruturasDeControle;

import java.util.Scanner;

public class DesafioMedia {
    // vamos pegar uma nota do usuário apenas se for valida
    // e para sair o usuário em que digitar -1
    int countM;
    double total,media, inputU;


    public void calcMedia(){
        
        media=total/countM;

        if(media>=0 && media<=10){
            System.out.println("Média:"+media);
        }else{
            System.out.println("Media invalida:"+ media);
        }
        
    }

    public void userInput(){
        Scanner scan = new Scanner(System.in);
        double num=0;

        System.out.println("Se desejar sair digite -1");

        do{
            System.out.print("Informe a nota:");
            num= scan.nextDouble();
            if(num!= -1 && (num>=0 && num<=10)){
                total+=num;
                countM++;
            }else{
                System.out.println("Informe um valor valido, ou -1 para sair.");
            }
            
        }while (num != -1);       
        scan.close();
    }

    public static void main(String[] args) {
        DesafioMedia med = new DesafioMedia();
        med.userInput();
        med.calcMedia();
    }
}

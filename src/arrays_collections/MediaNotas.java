package arrays_collections;
import java.util.Scanner;

public class MediaNotas {
    Scanner scan;
    private int numNota, numAlunos;
    private double mediaTurma;
    private double [][] notasTurma;

    public void userInput(){
        scan = new Scanner(System.in);
        System.out.print("informe a quantidade de alunos:");
        numAlunos = scan.nextInt();
        System.out.print("informe a quantidade de notas ");
        numNota = scan.nextInt();
        
        double [][] notasTurma = new double[numAlunos][numNota];  

        //listaNotas = new double[numNota];

        for(int a=0; notasTurma.length>a; a++){
            
            for(int n=0; notasTurma[a].length> n; n++){
                
                System.out.printf("informe a nota do aluno %d: ", a+1);
                notasTurma[a][n] = scan.nextDouble();
            }            
        }
    }

    public double calcMediaTurma(){
        double somaTotal=0;
        for(int a=0; notasTurma.length>a; a++){            
            for(int n=0; notasTurma[a].length> n; n++){
                somaTotal += notasTurma[a][n];  
            }            
        }        
        mediaTurma = somaTotal/(numAlunos * numNota);  
        
        return mediaTurma;
    }

    public void go(){
        userInput();
        double result = calcMediaTurma();
        System.out.println("a media da turma foi de "+result);
    }
}

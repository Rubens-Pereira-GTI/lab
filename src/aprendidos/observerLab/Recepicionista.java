package observerLab;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//esse é o nosso subject
// subjev é responsavel pela lista de observadores
// pelo envio do evento ao observer
public class Recepicionista extends Thread{
    
    List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

    void addFuncionarioObserver(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
        start();
    }
    @Override
    public void run(){
        boolean bossArrive = false;
        int senha = 0;
        while (senha <=5) {
            if(senha >= 5){
                ChegadaFuncionarioEvent event = new ChegadaFuncionarioEvent(new Date());
                for(ChegadaObserver obs : listaFuncionarios){
                    obs.chegouEvent(event);
                }
                senha++;
            }else{
                senha++;
                System.out.println("Chegou mais um");
            }

        }
    }
}

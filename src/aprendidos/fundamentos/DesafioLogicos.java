package fundamentos;

public class DesafioLogicos {
    // trabalho na terça (V ou F)
    // trabalho na quinta (V ou F)
    // se os dois trabalhos forem V então comprar um TV de 50p
    // se apenas um for V então comprar uma TV de 32p
    //  comprando qualquer uma das duas vai ter sorvete 
    // se nada der certo a familia fica em casa

    boolean trabTerca=false, trabQuarta=false;
    String mensagem= "A familia não vai comprar a TV";

    public void go(){
        sorte();
        //System.out.println(trabQuarta);
        
        if (trabQuarta && trabTerca) {
            mensagem = "A familia vai comprar uma TV de 50p";       
        }if(trabQuarta ^ trabTerca){
            mensagem = "A familia vai comprar uma TV de 32p";
        }if(trabQuarta || trabTerca){
            mensagem = mensagem + " e também tomam sorvete";
        }else{
            mensagem = mensagem + " e não vão tomar sorvete";
        }

        System.out.println(mensagem);
    }

    // vai dizer se ele conseguiu o trabalho ou não
    public void sorte(){
        int num = (int) (Math.random() * 6);
        int num2 = (int) (Math.random() * 6);
        if(num >=3){
            trabQuarta = true;
        }if(num2 >= 3){
            trabTerca=true;
        }
    }

    public static void main(String[] args) {
        DesafioLogicos desafio = new DesafioLogicos();
        desafio.go();
    }



}

package oo.composicao.desafioComprav2;

public class ClienteTeste{
    
    String nome = "ff";
    static String especie = "Mamiferos";
    
    
    ClienteTeste(){        
        System.out.println(nome);     
    }
    
    void setarVStatico(String n){
        especie = n;
    }

    void teste(){
        setarVStatico(nome);
    }
    void imprimir(){
        System.out.println("onde vou aparecer? Qual a ordem");
    }

    public static void main(String[] args) {
        
        //System.out.println(ClienteTeste.especie);   
        
        especie="Rubens";
        Cliente cliente = new Cliente("Rubens");    
        
        //ClienteTeste ct = new ClienteTeste();        
        
        Compra compra1 = new Compra(cliente);
        int num1 = 1; 
        int num2 =2;
        num1 =num2; 
        compra1.addCompra(new Item("Balão de Festa", 50, 1));
        compra1.addCompra(new Item("Velas", 2, 2.5));
        compra1.addCompra(new Item("Bolo", 1, 50));        

        Compra compra2 = new Compra(cliente);
        compra2.addCompra(new Item("Coca cola", 4, 10));
        
        cliente.obterValorTotal();

    }
}

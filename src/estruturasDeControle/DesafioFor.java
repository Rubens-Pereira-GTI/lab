package estruturasDeControle;

public class DesafioFor {
    
    public static void main(String[] args) {
        
        String valor = "#";
        for(int i=1; i<=5; i++){
            System.out.println(valor);
            valor+="#";
            //System.out.println(valor);
        }

        // for sem utilizar o controle por numero
        for(String v="#"; v.equals("#####"); v+="#"){
            System.out.println(v);
        }
    }

}

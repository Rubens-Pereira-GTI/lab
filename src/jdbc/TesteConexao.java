package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TesteConexao {

    public static void main(String[] args) {
        
        //string de conexão
        String stringDeConexao = "jdbc:myslq://localhost:3306";

        String usuario = "root";
        String senha = "r08b14";

        try {
            Connection conexao = DriverManager
                .getConnection(stringDeConexao, usuario, senha);
            System.out.println("Conexão efetuada com sucesso");
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

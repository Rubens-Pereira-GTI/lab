package socketLab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TesteSocketInput {
    public static void main(String[] args) {
        try {
            
            Socket socket = new Socket("127.0.0.1", 50000);
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            String texto = br.readLine();

            //fechando os recursos
            br.close();
            isr.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package TratErr;

import java.util.Scanner;

public class Finally {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);    

        try {
            System.out.println(7 / scan.nextInt());
            scan.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Finalmente");
            scan.close();
        }
        System.out.println("Fim.");

    }
    
}

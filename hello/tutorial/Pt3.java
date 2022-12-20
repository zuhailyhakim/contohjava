import java.util.Scanner;

public class Pt3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       
        
        System.out.println("masukkan gred anda: " );
        int gred = input.nextInt();

        System.out.println("adakah anda sama gred matematik dan sains? : true or false ");
        boolean bil = input.nextBoolean();
         input.close();

        if(bil == true){
        if(gred < 100){
         System.out.println("bilangan A dalam pt3 adalah 5 atau lebih");   
        }else{
            System.out.println("mendapat A dalam matematik dan jugak A dalam bahasa inggeris");
        }
    }
    }
}

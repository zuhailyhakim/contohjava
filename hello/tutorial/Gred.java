import java.util.Scanner;

public class Gred {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    

    int sains = 80;
    System.out.println("sila masukkan markah matematik anda : " );
    int gred = input.nextInt();

    input.close();

    if(gred == sains){
        System.out.println("markah anda sama dengan sains");
    }else{
        System.out.println("markah anda tidak sama dengan sains");
    }
    }
}

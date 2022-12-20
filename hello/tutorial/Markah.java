import java.util.Scanner;

public class Markah {
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    int markah = 45;
    System.out.println("sila masukkan markah anda : " );
    int gred = input.nextInt();

    input.close();

    if(gred >= markah){
        System.out.println("tahniah, anda lulus");
    }else{
        System.out.println("anda gagal, usaha lagi!");
    }
}    
}

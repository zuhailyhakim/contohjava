import java.util.Scanner;

public class Genapganjil {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);    

    System.out.println("sila masukkan nombor : " );
    int nom = input.nextInt();

    input.close();

    if(nom % 2 == 0){
        System.out.println("nombor"+ nom +"adalah nombor genap");
    }else{
        System.out.println("nombor"+ nom +"adalah nombor ganjil");
    }
    }
}

import java.util.Scanner;

public class Jpj {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    int tahun = 17;
    System.out.println("masukkan umur anda : " );
    int tahun_kelahiran = input.nextInt();
    
    input.close();
    if(tahun_kelahiran >= tahun){
        System.out.println("anda sudah layak memohon lesen memandu");
    }else{
        System.out.println("maaf, anda tidak layak memohon lesen motosikal");
    }
    }
}

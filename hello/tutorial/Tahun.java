import java.util.Scanner;


public class Tahun {
public static void main(String[] args) {
    //paparan output maklumat awal aturcara
    System.out.println("aturcara mengira kelender cina");
    
    //pengisytiharan pembolehubah scanner
    Scanner input = new Scanner(System.in);
    input.close();
    //papar teks pertanyaan
    System.out.println("taipkan tahun: ");

    //pengisytiharan pembolehubah input dan pengiraan
    int tahun_masihi = input.nextInt();
    int tahun_cina= tahun_masihi % 12;

    //guna kawalan switch-case
    switch(tahun_cina){
        case 0 :
        System.out.println("Tahun "+tahun_masihi+" adalah "+" tahun monyet" );
        break;
        case 1 :
        System.out.println("Tahun "+tahun_masihi+" adalah "+" tahun ayam" );
        break;
        case 2 :
        System.out.println("Tahun "+tahun_masihi+" adalah "+" tahun anjing" );
        break;
        case 3 :
        System.out.println("Tahun "+tahun_masihi+" adalah "+" tahun babi" );
        break;
        case 4 :
        System.out.println("Tahun "+tahun_masihi+" adalah "+" tahun tikus" );
        break;
        case 5 :
        System.out.println("Tahun "+tahun_masihi+" adalah "+" tahun lembu" );
        break;
        case 6 :
        System.out.println("Tahun "+tahun_masihi+" adalah "+" tahun harimau" );
        break;
        case 7 :
        System.out.println("Tahun "+tahun_masihi+" adalah "+" tahun arnab" );
        break;
        case 8 :
        System.out.println("Tahun "+tahun_masihi+" adalah "+" tahun naga" );
        break;
        case 9 :
        System.out.println("Tahun "+tahun_masihi+" adalah "+" tahun ular" );
        break;
        case 10 :
        System.out.println("Tahun "+tahun_masihi+" adalah "+" tahun kuda" );
        break;
        case 11 :
        System.out.println("Tahun "+tahun_masihi+" adalah "+" tahun kambing" );
        break;
    }
}    
}

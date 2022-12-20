import java.util.Scanner;


public class Merdeka {
public static void main(String[] args) {
    
    //paparan output-makluman awal aturcara
    System.out.println("aturcara tentukan lahir sebelum / selepas merdeka");

    //pengisytiharan pembolehubah scanner
    Scanner input=new Scanner(System.in);
    input.close();

    //papar teks pertanyaan
    System.out.println("masukkan tahun anda dilahirkan dan tekan enter");
    int lahir=input.nextInt();

    //pengisytiharan pembolehubah input
    int merdeka=1957;

    //menggunakan struktur kawalan if else
    if (lahir > merdeka){

    //papar output true
    System.out.println("anda dilahirkan selepas merdeka");
    }else{
    //papar output false
    System.out.println("anda dilahirkan sebelum merdeka");
    }
}    
}

import java.util.Scanner;


public class Contoh_oop {
public static void main(String[] args) {
    
    //pengisytiharan pembolehubah scanner
    Scanner input= new Scanner(System.in);
    input.close();

    //makluman awal aturan 
    System.out.println("aturcara menentukan tahap umur");
    //papar teks pertanyaan
    System.out.println("taip umur anda dan tekan enter: ");
    int umur=input.nextInt();
    //kawalan if-else dengan operasi hubungan dan logik 
    if(!(umur > 11)){
        System.out.println("anda masih kanak-kanak");
    }
    else if (umur >= 11 && umur <= 18){
        System.out.println("anda masih remaja");
    }
    else if (umur >= 18 && umur <= 35){
        System.out.println("anda masih dewasa");
    }
    else if (umur == 36 || umur <= 60){
        System.out.println("anda sudah dipertengahan dewasa");
    }
    else {
        System.out.println("anda sudah warga emas");
    }
}    
}

import java.util.Scanner;

public class Hasildarab {
    public static void main(String[] args) {
        
    //paparan output-makluman awal aturancara
    System.out.println("aturcara permainan matematik-operasi darab");

    //pengisytiharan pembolehubah scanner
    Scanner input=new Scanner(System.in);
    input.close();

    //ishtihar pembolehubah dan papar teks pertanyaan
    int nom1,nom2;
    String jawab;

    //kawalan ulangan do while
    do{
        System.out.println("nombor pertama: ");
        nom1=input.nextInt();
        System.out.println("nombor kedua: ");
        nom2=input.nextInt();

        //paparan output
        System.out.println("hasil darab:" + nom1 +" X " + nom2 +"=" + Math.abs(nom2 * nom1));
        
        //pertanyaan ulangan 
        System.out.println("taipkan Y untuk teruskan...");
        jawab=input.next();

        //ulangan selagi syarat ditepati
     }while (jawab.equals("Y")||jawab.equals("y"));
    }
}

import java.util.Scanner;

public class Soalan1 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    //paparan output-makluman awal aturcara 
    System.out.println("aturcara matematik tambah nombor genap & ganjil");

    //pengisytiharan pembolehubah scanner
    Scanner taip = new Scanner(System.in);

    //papar teks pertanyaan & isytihar pembolehubah input 
    System.out.println("taip nombor rendah");
    int nom_rendah = taip.nextInt();
    System.out.println("taip nombor tinggi");
    int nom_tinggi = taip.nextInt();

    //isytihar pembolehubah dan nilai awal 
    int jumgenap = 0, jumganjil =0;
    int nombor = nom_rendah;

    //kawalan ulangan guna while dan if else
        while(jumgenap % 2 == jumganjil){
            System.out.println("letakkan nombor anda : " + jumgenap);
            jumgenap++;
        }

 
    //paparan output
    System.out.println("jumlah nombor-nombor ganjil dari "
     + nom_rendah + " ke "+ nom_tinggi +" adalah "+ jumganjil);
     System.out.println("jumlah nombor-nombor genap dari "
      + nom_rendah + " ke "+ nom_tinggi +" adalah "+ jumgenap);
}
}

import java.util.Scanner;

public class Bilangan_tambah {
    public static void main(String[] args) {
        
    //insytiharan pembolehubah scanner
    Scanner input = new Scanner(System.in);

    //insytihar pembolehubah dan nilai awal
    int nombor, jumlah = 0, bilang;

    System.out.println("aturcara mengira jumlah 5 nombor yang inputkan");

    //kawalan ulangan guna for dan post-increment
    for{


    //paparan out
    System.out.println("nombor"+bilang+":");
    nombor = input.nextInt();
    jumlah += nombor;
    }
    System.out.println("hasil tambah bagi 5 nombor di atas adalah" +jumlah);
}
}

//import class
import java.time.Year;
import java.util.Scanner;
public class Peribadi {
public static void main(String[] args) {
    
//pengisytiharan pembolehubah scanner
Scanner input = new Scanner(System.in);

//papar teks pertanyaan1 dan isytihar pembolehubah nilai input1
System.out.println("masukkan nama anda: ");
String nama = input.next();

//papar teks pertanyaan2 dan isytihar pembolehubah nilai input2
System.out.println("masukkan tahun anda dilahirkan: ");
int tahun = input.nextInt();

//papar teks pertanyaan3 dan isytihar pembolehubah nilai input3
System.out.println("masukkan bandar anda dilahirkan: ");
String negeri = input.next();

input.close();
//pengiraan umur
int tahunsemasa = Year.now().getValue();
int umur = tahunsemasa - tahun;

//memaparkan output
System.out.println("Nama :" +nama);
System.out.println("umur :" +umur);
System.out.println("bandar kelahiran :" +negeri);
}
}

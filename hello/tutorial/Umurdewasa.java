import java.time.Year;
import java.util.Scanner;


public class Umurdewasa {
    public static void main(String[] args) {
        //paparan output-maklumat awal aturcara
        System.out.println("ATURCARA MENGIRA UMUR DAN PERINGKAT DEWASA");
        //pengisytiharan pembolehubah scannar
        Scanner input = new Scanner(System.in);
        //paparan teks pertanyaan
        System.out.println("taip tahun kelahiran anda dan tekan ENTER:");
        input.close();
        //pengisytiharan pembolehubah input dan output
        
        int umur;
        int tahun_lahir = input.nextInt();
        int tahun_semasa;

        //pengiraan umur
        tahun_semasa = Year.now().getValue();
        umur=tahun_semasa-tahun_lahir;
        //menggunakan struktur kawalan if

        if (umur < 19){
            //papar output
            System.out.println("anda berumur "+umur+" , anda belum dewasa.:");
        }
    }
}

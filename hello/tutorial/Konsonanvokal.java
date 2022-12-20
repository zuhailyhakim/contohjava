import java.time.Year;
import java.util.Scanner;

public class Konsonanvokal {
    public static void main(String[] args) {
        //paparan output-makluman awal aturancara
        System.out.println("aturcara bilang huruf konsonan dan vokal");

        //pengisytiharan pembolehubah scanner
        Scanner taip= new Scanner(System.in);
        taip.close();
        //papar teks pertanyaan dan istihar pembolehubah
        System.out.println("taip satu perkataan dan tekan enter");
        String perkataan =taip.next();
        char [] hurufv = perkataan.toCharArray();
        int vokal = 0;

        //kawalan ulangan for
        for (char h: hurufv){
            if(h == 'a' || h == 'a' || h == 'e' || h == 'E' || h == 'i' || h == 'I' ||
             h == 'o' || h == 'O' || h == 'u' || h == 'U'){

        //penambah
        vokal++;
             }
        }
        //paparan output
        System.out.println("bilangan huruf vokal dalam " + perkataan +" adalah: " +vokal);
        System.out.println("bilangan huruf konsonan dalam " + perkataan + " adalah: " +(hurufv.length - vokal));
    }
}

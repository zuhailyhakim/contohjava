import java.text.DecimalFormat;
import java.util.Scanner;

public class Sfera {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

    System.out.println("letakkan jejari anda :");
   double jejarian = input.nextDouble();


   double bil=1.3;
    double jejari= 3.142;

   input.close();
    
   bil = (1.3*3.142*(jejari*jejari*jejari));

    if(bil== jejari ){
        System.out.println("inilah nilai anda");
    }else {
        System.out.println("sila cuba lagi");
    }
    }
}

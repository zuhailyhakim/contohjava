public class operasi {
    public static void main(String[] args) {
        int nom1,nom2;
        int op1,op2,op3,op4,op5;

        nom1=15;
        nom2=2;

        op1=nom1+nom2;
        op2=nom1-nom2;
        op3=nom1*nom2;
        op4=nom1/nom2;
        op5=nom1%nom2;

        System.out.println("hasil tambah:" +nom1+ '+' +nom2+ '=' +op1);
        System.out.println("hasil tolak:" +nom1+ '-' +nom2+ '=' +op2);
        System.out.println("hasil darab:" +nom1+ '*' +nom2+ '=' +op3);
        System.out.println("hasil bahagi:" +nom1+ '/' +nom2+ '=' +op4);
        System.out.println("hasil modulus:" +nom1+ '%' +nom2+ '=' +op5);
    }
}

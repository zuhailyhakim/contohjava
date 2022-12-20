import java.text.DecimalFormat;

public class Decimal_format {
    public static final DecimalFormat df = new DecimalFormat("0.00");
public static void main(String[] args) {
    
    double result = 10.000;

    System.out.println(df.format(result));
}
}

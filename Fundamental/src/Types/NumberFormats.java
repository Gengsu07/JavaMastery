package Types;
import java.text.NumberFormat;

public class NumberFormats {
    public static void main(String[] args) {
        double nominal = 1234563.87;
        // tidak bisa menggunakan = new NumberFormat() karena NumberFormat adalah interface/class Abstract

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(nominal)); // $1,234,563.87

        float desimal = 0.12f;
        String percent = NumberFormat.getPercentInstance().format(desimal);
        System.out.println(percent); // 12.0%
    }
}
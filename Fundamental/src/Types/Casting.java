package Types;
public class Casting {
    public static void main(String[] args) {
        short x = 1;
        double pecahan = 5.0;
        String angka = "10";

        int hasil = x + 2;
        double hasil2 = x + 3;
        int hasil3 = (int) pecahan + 4;
        System.out.println(hasil);
        System.out.println(hasil2);
        System.out.println(hasil3);
        System.out.println(Integer.parseInt(angka));
    }
}

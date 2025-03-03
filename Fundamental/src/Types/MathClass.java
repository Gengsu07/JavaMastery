package Types;
public class MathClass {
    public static void main(String[] args) {
        double x = 1.1;
        int acak= (int) (Math.random() *100);
        int ceil = (int) Math.ceil(x);
        System.out.println(Math.round(x));
        System.out.println(ceil);
        System.out.println(acak);
        System.out.println(Math.max(10,23));
        System.out.println(Math.min(10,23));
    }
}

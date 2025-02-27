
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,5,6};
        numbers[0] = 7;
        numbers[1] = 1;

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
package Types;
import java.util.Arrays;

public class Array{
    public static void main(String[] args){
        int[] numbers = new int[10];
        int [] numbers2 = {1,2,3,4,5,6,7,8,9,10};
        numbers[0] = 1;
        numbers2[0] = 2;
        System.out.println("numbers:"+ Arrays.toString(numbers));
        System.out.println("numbers2: "+ Arrays.toString(numbers2));
        System.out.println("MultiDimensional\n");
        MultiDImArray.oldWay(args);
        MultiDImArray.newWay(args);
    }
}

class MultiDImArray{
    public static void oldWay(String[] args){
        int[] [] tabledata = new int [2][3];
        tabledata[0][0] = 7;
        System.out.println(Arrays.deepToString(tabledata));
    }

    public static void newWay(String[] args){
        int[][] tabledata = {{1,2,3},{4,5,6},{7,8,9}};
        tabledata[1][0] = 8;
        System.out.println(Arrays.deepToString(tabledata));
    }
}
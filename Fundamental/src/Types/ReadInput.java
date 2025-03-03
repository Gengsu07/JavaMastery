package Types;
import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner nama = new Scanner(System.in);
        System.out.print("Nama: ");
        String name = nama.nextLine().trim();

        Scanner input = new Scanner(System.in);
        System.out.print("Umur: ");
        short umur = input.nextShort();
        
        System.out.println("Nama " + name+ " umur " + umur);       
        input.close();
        nama.close();   
    }
    
}

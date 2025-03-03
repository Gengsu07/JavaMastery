package Types;
import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class MortgageCalculator {
    public static void main(String[] args) {
        System.out.print("Principal: ");
        Scanner principal = new Scanner(System.in);
        long principalAmount = principal.nextLong();

        System.out.print("Annual Interest Rate(%): ");
        Scanner rate = new Scanner(System.in);
        float interestRate = rate.nextFloat();

        System.out.print("Period (Years): ");
        Scanner period = new Scanner(System.in);
        int periodeYears = period.nextInt() ;

        double monthPayment = calculateMorgage(principalAmount, interestRate, periodeYears);
        System.out.print("Mortgage: " + NumberFormat.getCurrencyInstance().format(monthPayment));
        
        principal.close();
        rate.close();
        period.close();
    }
    public static double calculateMorgage(long principal, float interestRate, int periodeYears){
        float monthlyInterestRate = interestRate / 1200;
        int periodeMonth = periodeYears * 12;
        double secretNumber = Math.pow(1+monthlyInterestRate, periodeMonth);
        double monthPayment = principal * ((monthlyInterestRate * secretNumber)/(secretNumber-1));
        return monthPayment;
    }
}

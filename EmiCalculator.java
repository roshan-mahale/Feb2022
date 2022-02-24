import java.util.Scanner;
import java.lang.Math;

public class EmiCalculator {
    public static void main(String[] args) {
        byte MONTHS = 12;
        byte PERCENTAGE = 100;
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Principle: ");
            int Principle = scanner.nextInt();

            System.out.println("Annual Rate of Interest: ");
            float AnnualRateofInterest = scanner.nextFloat();
            float MonthlyRateofInterest = AnnualRateofInterest/MONTHS/PERCENTAGE;

            System.out.println("Years: ");
            int Years = scanner.nextInt();
            Years = 12*Years;

            double EMI = (Principle*MonthlyRateofInterest*Math.pow(1+MonthlyRateofInterest, Years))/(Math.pow(1+MonthlyRateofInterest, Years)-1);
            
            
            
            System.out.println(EMI);
        }
        
    }
}

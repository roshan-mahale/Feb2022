import java.util.Scanner;
import java.lang.Math;

public class EmiCalculator {
    public static void main(String[] args) {
        byte MONTHS = 12;
        byte PERCENTAGE = 100;
        int Principle = 0;
        float AnnualRateofInterest = 0.0f;
        int Years = 1;
        float MonthlyRateofInterest = 0.0f;

    
        try (Scanner scanner = new Scanner(System.in)) {
           while (true) {
              
            System.out.println("Principal amount(1k to 1cr.): ");
            Principle = scanner.nextInt();
            if (Principle>=1000 && Principle<=10000000){
                break;
            }
             System.out.println("Enter correct value");
         
        }

            while (true) {
                System.out.println("Annual Rate of Interest: ");
            AnnualRateofInterest = scanner.nextFloat();
            
        if (AnnualRateofInterest>0 && AnnualRateofInterest<=50) {
            MonthlyRateofInterest = AnnualRateofInterest/MONTHS/PERCENTAGE;
                break;
        }
           System.out.println("Enter between 0-50: " );
    } 
            while (true) {
            System.out.println("Years: ");
            Years = scanner.nextInt();
           if (Years>0 && Years<=30){
            Years = 12*Years;
            break;
        }
            System.out.println("Enter years between 1-30: ");
                
            }
            

            double EMI = (Principle*MonthlyRateofInterest*Math.pow(1+MonthlyRateofInterest, Years))/(Math.pow(1+MonthlyRateofInterest, Years)-1);
            
            
            
            System.out.println(EMI);
        }
        
    }
} 

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n;
            System.out.println("Enter No.: ");
            n = obj.nextInt();
            
            if (n%2==0) {
                System.out.println("The number "+n+" is Even.");

            } else {
                System.out.println("The number "+n+" is Odd.");
            }
        }
    }
    
}

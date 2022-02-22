import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
    try (Scanner obj = new Scanner(System.in)) {
        System.out.println("Enter no. : ");
        
        int n = obj.nextInt();

        for (int i = 1; i<=10; i++) {
            System.out.println(i*n);
      
        
      }
    }
        
        
    }

    
    
}

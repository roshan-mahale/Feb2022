import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
   Scanner obj = new Scanner(System.in);
        System.out.println("Enter no. : ");
        
        int n;
        n = Integer.parseInt(obj.nextLine());

        for (int i = 1; i<=10; i++) {
            System.out.println(n+"x"+i+"="+i*n);
      }
    }
}

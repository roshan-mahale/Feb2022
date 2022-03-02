import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n;
   try  {
    System.out.println("Enter no. : ");
    
    
    n = Integer.parseInt(obj.nextLine());

    for (int i = 1; i<=10; i++) {
        System.out.println(n+"x"+i+"="+i*n);
     }
} catch (NumberFormatException e) {
    System.out.println("Number Allowed Only");
} finally{
    obj.nextLine();
}
    }
}

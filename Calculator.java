import java.util.Scanner;
public class Calculator {
public static void main(String[] arg) { 
   Scanner obj = new Scanner(System.in);
        float a, b;
        char operator;
        
        try {
        System.out.println("Enter no.: ");
        a = obj.nextFloat();
        System.out.println("Enter no.: ");

        b = obj.nextFloat();
        System.out.println("Enter(+,-,*,/): ");
        operator = obj.next().charAt(0);
        
        switch(operator)
        {
        
            case '+': 
        {
            System.out.println("Total after Sum: "+(a+b));
            break;
        }
            case '-': 
            {
                System.out.println("Total after Substraction: "+(a-b));
                break;
            }
            case '*': 
            {
                System.out.println("Total after Multiply: "+(a*b));
                break;
            }
            case '/': 
            {
                System.out.println("Total after Division: "+(a/b));
                break;
            }
            default:
            {
                System.out.println("Enter correct operator");
                return;
            }
        } 
        
        

    } catch (NumberFormatException exception){
        System.out.println("Number Only Allowed");
    } 
     catch (Exception e) {
        System.out.println("Report Error 022-64536736");
    }
    finally {
        obj.nextFloat();
    }

}


    
}

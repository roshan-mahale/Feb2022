import java.util.Scanner;
public class Calculator {
public static void main(String[] arg) { 
    Scanner sc = new Scanner(System.in);
    float a, b;
    char operator;
    
    System.out.println("Enter no.: ");
    a = sc.nextFloat();
    System.out.println("Enter no.: ");

    b = sc.nextFloat();
    System.out.println("Enter(+,-,*,/): ");
    operator = sc.next().charAt(0);
    
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
    
    
    
    
    

}


    
}

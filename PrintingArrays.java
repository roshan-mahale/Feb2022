import java.util.Arrays;

public class PrintingArrays {
    public static void main(String[] args) {
      /* int [] marks = new int [5];
       marks[0] = 90;
       marks[1] = 86;
       marks[2] = 79;
       marks[3] = 80;
       marks[4] = 87; 
        */
        int [] marks = {80,90,100,110,120};
      // System.out.println(marks[4]);
        //Print all arrays using for loop.
        System.out.println(marks.length);
        for (int i=0; i<marks.length;i++)
        System.out.print(marks[i]+" ");
        System.out.println("");
        //Print all arrays using for loop In reverse order.
        for (int i=marks.length-1; i>=0;i--)
        System.out.print(marks[i]+" ");

        //Print arrays using for-each loop.
        //for (int element:marks)
        //System.out.println(element);
        
        //System.out.println(Arrays.toString(marks));
    }
    
}

import java.util.Arrays;

public class ArraysExcersise {
     static int i;

    public static void main(String[] args) {
        int [] myArray1 = { 42, 33, 52, 83, 48, 99, 403, 49, 56, 79};

        String [] myArray2 ={"john", "steven", "tony", "monica", "smith", "jasmine"};
        //print all arrays
       System.out.println("All array1 are: "+Arrays.toString(myArray1));
        System.out.println("All array2 are: "+Arrays.toString(myArray2));
        
        
       //Print Sort arrays
       Arrays.sort(myArray1);
       System.out.println("All Sort array1 are: "+Arrays.toString(myArray1));
       Arrays.sort(myArray2);
       System.out.println("All Sort array12 are: "+Arrays.toString(myArray2));

        //Print all arrays in reverse
       int l = myArray1.length;
       int n = Math.floorDiv(l, 2);
       int temp;
       for (int i=0; i<n; i++){
        //Swap with temparary variable
        temp = myArray1[i];
        myArray1[i]= myArray1[l-i-1];
        myArray1[l-i-1] = temp;
       }
       for (int element:myArray1)
       System.out.print("all the"+ element+" ");

        
    }
}

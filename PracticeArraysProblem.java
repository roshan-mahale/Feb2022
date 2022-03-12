public class PracticeArraysProblem {
    public static void main(String[] args) {
      //If no. is present in array
       float [] numbers = {45.6f,52.6f,63.5f,85.3f,95.8f};
       float a = 45.6f;
       boolean isInArray=false;
       for(float elements:numbers) {
           if(a==elements){
               isInArray = true;
               break;
            }
        }
        if (isInArray){
            System.out.println("The float is present in array.");
        }else {
            System.out.println("The float is Not-present in array.");
        }
        


        //Addition of two matrix
    int [] [] mat1 = {{1, 2, 3},
                      {4, 5, 6}};
    int [] [] mat2 = {{8, 6, 9},
                      {7, 4, 5}};
    int [] [] result = {{0, 0, 0},
                        {0, 0, 0}};

    for (int i=0;i<mat1.length;i++){
        for(int j=0;j<mat1[i].length;j++){
            result [i] [j] = mat1 [i] [j] + mat2 [i] [j];
            System.out.print(result [i] [j]);
            System.out.print(" ");// space between two no.
        }
        System.out.println("");//add new line
    }   

//print maximum value in arrays
int [] marks = {5,56,76,45,88,96,65,45,35};
int max = 0;
for(int element:marks){
    if(element>max){
        max=element;
    }
}System.out.println("The maximum no. in arrays is: "+max); 

//print minimum value in arrays
int [] marks1 = {5,56,76,45,88,96,65,45,35};
int min =Integer.MAX_VALUE ;
for(int element:marks1){
    if(element<min){
        min=element;
    }
}System.out.println("The minimum no. in arrays is: "+min);
   
}
    
}

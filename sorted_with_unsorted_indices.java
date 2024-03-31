  
package JAVA;
  import java.util.Arrays;
import java.util.Scanner;
public class sorted_with_unsorted_indices{
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int array[]=new int[size];

        for(int i=0; i<size ;i++){
            array[i]=input.nextInt();
        }
        
        
        int array2[]=new int [size];
        for(int i =0; i<size;i++){
            array2[i]=array[i];
        }
        Arrays.sort(array2);
       
        int newarray[]=new int[size];

        for(int i =0 ; i < size ; i++){
            newarray[i]=array2[size-1-i];
        }

        for(int  i = 0 ; i<size;i++){
            for(int j = 0 ; j<size ; j++){
                if (newarray[i]==array[j]){
                    System.out.println(j);
                    array[j]=-122;
                }
            }

}
      }
    }

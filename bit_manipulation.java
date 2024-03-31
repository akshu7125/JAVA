
package JAVA;
import java.util.*;
public class bit_manipulation{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the  number");
        int num=scan.nextInt();
        int i=0;
       
        while (num > 0){

           if(num % 2==1){
            System.out.print("the first set bit is at position: "+ (i+1));
            break;
           }
           num=num/2;
           i++;
          
        }
        // for (int j = bin.length - 1; j >= 0; j--)
        //     System.out.print(bin[j]);
        //     System.out.println();
        //     for (int j = bin.length - 1; j >= 0; j--){
        //         if(bin[j]==1)
        //         System.out.print("the first set bit from right is at position: "+j);
                
        //         break;
        //     }
}
}
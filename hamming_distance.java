
package JAVA;
import java.util.*;
public class hamming_distance {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int xor=num1^num2;
        System.out.print(xor);
        int i=0;
        int count=0;
        String binary="";
        while (xor > 0){
            
           if(xor % 2==1){
                binary+=0;
           }
           else binary+=1;
           xor=xor/2;
           i++;
          
        }

        }
    
}

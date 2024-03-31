//package JAVA;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        int count=0;
        int n=153;
        int n1=n;
        while(n1 !=0){
            n1/=10;
            count++;
        }
        int j=0;
        int sum=0;
        while(n!= 0){
            j=n%10;
            sum+=Math.pow(j,count);
            n/=10;
           // System.out.print(sum);

        }
       System.out.print(sum);
    }
}

/// sum of binary numbers resulting a binary number.

package JAVA;
import java.util.*;
public class Binary_sum{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first binary number");
        String num1=scan.next();
        System.out.println("enter the second binary number");
        String num2=scan.next();

        int n1=Integer.parseInt(num1,2);
        int n2=Integer.parseInt(num2,2);
        int sum=n1+n2;
        System.out.print("the sum of the two binary numbers is: "+Integer.toBinaryString(sum));
        scan.close();

    }
}



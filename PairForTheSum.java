
package JAVA;
import java.util.Scanner;
public class PairForTheSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n=scan.nextInt();
        System.out.print("enter the elements of the array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int count=0;
        int target;
        
        System.out.print("enter the sum required: ");
        target=scan.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        System.out.print("the number of pairs are: "+count);
    }
}

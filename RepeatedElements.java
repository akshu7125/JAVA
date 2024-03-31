
//package JAVA;
import java.util.Scanner;
public class RepeatedElements {
    public static void main(String[] Args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the maximum number the element in the array can have:");
        int n=scan.nextInt();
        System.out.printf("enter the element in the range 0 to %d-1: ",n);
        int arr[]=new int[n];
        for(int i=0;i<n;i++ ){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }

    }
}

package JAVA;
import java.util.Scanner;

public class roseprice {
    


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
        int first=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    first=arr[i]-arr[j];   
                }
                 else if(arr[i]+arr[j]==target && arr[i]-arr[j]<first){
                    Sout
                }
            }
        }
        System.out.print("the number of pairs are: "+count);
    }
}


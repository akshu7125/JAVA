//package JAVA;
import java.util.*;
public class swapcolumns {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               System.out.print(arr[i][j]) ;
            }
            System.out.println();
        }
        for(int i=0;i<m;i++){
           // for(int j=0;j<n;j++){
                int temp=arr[i][0];
                arr[i][0]=arr[i][n-1];
                arr[i][n-1]=temp;
           // }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               System.out.print(arr[i][j]) ;
            }
            System.out.println();
        }
    }
}

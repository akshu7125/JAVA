//package JAVA;
import java.util.*;
public class kfromback {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        int i=0;
        while(true){
            arr[i]=sc.nextInt();
            if(arr[i]==-1)break;
            i++;
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        int k=sc.nextInt();
        for(int j=arr.length;j>0;j--){
            if(j==k){
                System.out.println(arr[j]);
            }
            
        }
        
    }
}

package JAVA;
import java.util.Scanner;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]==-121){
                continue;
            }int count=1;
             
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-121;
                }
    
        }
        System.out.print(arr[i]);
        System.out.println(count);
            
        }
    }
}

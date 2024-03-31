
package CODING.JAVA.COLLECTIONS;
import java.util.Scanner;
public class highest_peak {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n =scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        } 
        int max=arr[0];
        for(int i=1;i<n-1;i++){
              
             if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                    max=arr[i];
                }

            }
            System.out.print(max);
        }
    }



package JAVA;
import java.util.*;
public class triplet {
  public static void triplet(int arr[],int n){
    int count=0;
    for (int i = 0; i < n-2; i++) {
      for (int j = i+1; j < n; j++) {
        for (int j2 = j+1; j2 < n; j2++) {
          if((arr[i]+arr[j]==arr[j2] || (arr[i]+arr[j2]==arr[j]||(arr[j]+arr[j2]==arr[i])))){
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
   
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int count;
    int arr[]=new int[n];
    for (int i = 0; i < n; i++) {
      arr[i]=sc.nextInt();
    }
    triplet(arr, n);
    
    //System.out.println(count);

}
}
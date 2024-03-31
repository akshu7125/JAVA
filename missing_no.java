package JAVA;
import java.util.*;


public class missing_no {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
     arr[i]=scan.nextInt();
   }
  int sum=0;
  for (int i = 0; i < arr.length; i++) {
    sum+=arr[i];
  }
  int m=n+1;
  int total=m*(m+1)/2;
  System.out.println(total-sum);
}
}
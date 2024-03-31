
package JAVA;
import java.util.*;
	public class Jagged_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    //  int[][] arr=new int[3][];
    //     arr[0]=new int[1];
    //     arr[1]=new int[2];
    //     arr[2]=new int[3];
    //  for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[i].length;j++){
    //        arr[i][j]=sc.nextInt();
    //     }

    //  }
    //  for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[i].length;j++){
    //       System.out.print(arr[i][j]);
    //     }
    //     System.out.println();
    // }
    int n=sc.nextInt();
    int[][] arr=new int[n][];
    for(int i=0;i<n;i++){
         arr[i]=new int[i+1];
    }

    int count =1;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j]=count;
            count++;
        }
    }
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }



}
    }
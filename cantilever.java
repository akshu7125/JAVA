//package JAVA;
import java.util.*;
import java.lang.*;
public class cantilever {
public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        String letter=sc.nextLine();
//        String arr[]=s1.split(" ");
//        int count=0;

//        for(int i=0;i<arr.length;i++){
//            if(letter.equals(arr[i])){
//                count++;
//            }
//        }
//        System.out.println(count);


// }
Scanner sc = new Scanner(System.in);
       String s1 = sc.nextLine();
       char []arr=s1.toCharArray();

       for(int i=0;i<s1.length();i++){
           char c=s1.charAt(i);
           if(c>='A' && c<='Z'){
               if(i!=0){
                   System.out.print(" ");
               }
           }
           System.out.print(c);
       }
      }




}
   // public static void main(String[] args) {
   // //  int a=10;
   // //   int b=20;
   //  // int c=30;
   //  String s1="ABC";
   //  String s="abc";
   //  System.out.println(s.join(";",s1,s,s1));
   // }
   // public static void main(String[] args) {
	// 	String s1 = "abc";
	// 	String s2 = "abc";
	// 	System.out.println("s1 == s2 is:" + s1 == s2);
	// }
   //public static synchronized void main(String[] args) throws  
   // InterruptedException {  
   //      Thread f = new Thread();  
   //       f.start();  
   //       System.out.print("A");  
   //       f.wait(1000);  
   //       System.out.print("B");  
   // }
   // public static void main(String[] args) {
   //    Scanner sc = new Scanner(System.in);
   // int n = sc.nextInt();
   // String names[] = new String[n];
   // for (int i=0 ; i<n ; i++)
   // {
   //          names[i] = sc.nextLine();
   // }
   // String temp;
   // for (int i = 0; i < n; i++) {
   // for (int j = i + 1; j < n; j++) {
   // if (names[i].compareTo(names[j]) > 0) {
   // temp = names[i];
   // names[i] = names[j];
   // names[j] = temp;
   // }
   // }
   // }
   // for (int i = 0; i < n; i++) {
   // System.out.println(names[i]);
   // }
   
   
//}
   
  
   


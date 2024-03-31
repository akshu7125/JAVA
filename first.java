// public class solution{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         double y=sc.nextDouble();
//         String z=sc.nextString();

//         System.out.print(x);
//     }
// }
// import java.util.Scanner;

// public class first {

//     public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             int x=sc.nextInt();
//             double y=sc.nextDouble();
//              sc.nextLine();
//             String s=sc.nextLine();

//             System.out.println("String: "+s);
//             System.out.println("Double: "+y);
//             System.out.println("Int: "+x);
//     }
// }


///convert farheneit to celsius///
// import java.util.Scanner;
// public class first{
//     public static void main(String3[] args){
//         Scanner scan=new Scanner(System.in);
//         System.out.println("enter the temperatue in farheneit: ");
//         float farheneit=scan.nextFloat();
//         float celsius= (farheneit-32)*(5/9);
//         System.out.println("Temperature in celsius is: "+celsius);

//     }
// }

//  Write a java program to take the user for a distance(in meters) and the time was taken 
//(as three numbers: hpurs,minuted, seconds),and display the speed in meters per second,
// kilometers per hour


// import java.util.Scanner;
// public class first{
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         System.out.print("enter the distance: ");
//         int distance=scan.nextInt();
//         System.out.println("enter the time in hours: ");
//         int hours=scan.nextInt();
//         System.out.println("enter the time in minutes: ");
//         int minutes=scan.nextInt();
//         System.out.println("enter the time in seconds: ");
//         int seconds=scan.nextInt();
//         int timeinseconds=hours*3600+minutes*60+seconds;
//         int timeinhours=hours+minutes/60+seconds/3600;
//         float speedkmph=distance/timeinhours;
//         System.out.println("the speed in kilometer per hours is: "+speedkmph);
//         float speedmps=distance*1000/timeinseconds;
//         System.out.println("the speed in meter per seconds is: "+speedmps);
//         scan.close();

//     }
// }

///write a program to calculate the sum of the first and the second last digit of a 5 digit number. 
// import java.util.Scanner;
// public class first{
//     public static void  main(String[] args){
//         Scanner scan=new Scanner(System.in);
//         System.out.print("enter the 5 digit number: ");
//         int number=scan.nextInt();
//         int first=number/10000;
//         int last=number%100;
//         int secondlast=last/10;
//         int sum=secondlast+first;
//         System.out.println("the sum of the first and last digit is: "+sum);

//     }
// }

///write a program to reverse a 3-digit number without using an array.

// import java.util.Scanner;
// public class first{
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         System.out.print("enter the 3 digit number: ");
//         int number=scan.nextInt();
//         int rev=number%10;
//         number=number/10;
//         System.out.print(rev);
//          rev=number%10;
//          number=number/10;
//         System.out.print(rev);
//          rev=number%10;
//         number=number/10;
//         System.out.print(rev);
//         scan.close();
//     }
// }

///the total number of students in a class are 90 out of which 45 are boys.if 50% of the total 
//students secured grade 'A' out of which 20 are boys, then write the program to calculate 
//the total number of girls getting grade 'A'

// public class first{
//     public static void main(String[] args) {
//         int total=90;
//         int gradeA=(50*total)/100;
//         int girls=gradeA-20;
//         System.out.print("Number of girls are " +girls);
//     }
// }

/*create a restaurant customer service system where a waiter will keep on taking the order from customer until customer says done.
print the menu with at least 6 items customer will choose from that menu and in case of no order customer will give 0 as input. 
after the completion provide the customer with a bill also.*/



// import java.util.Scanner;
// public class first{
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         System.out.println("pizza : 200/-");
//         System.out.println("burger: 150/-");
//         System.out.println("fries : 300/-");
//         System.out.println("Shake : 200/-");
//         System.out.println("lassi : 100/-");
//         System.out.println("chaae : 500/-");

      
//         boolean flag=true;
//         int sum=0;
//         while(flag){
//             int item=scan.nextInt();
//             if(flag==false)break;
//             else if(item==1) {
//                 System.out.print("pizza : 200/-");
//                 sum+=200;
//             }
//             else if(item==2) {
//                 System.out.print("burger : 150/-");
//                 sum+=150;
//             }
//             else if(item==3) {
//                 System.out.print("fries : 300/-");
//                 sum+=300;
//             }
//             else if(item==4) {
//                 System.out.print("shake : 200/-");
//                 sum+=200;
//             }
//             else if(item==5) {
//                 System.out.print("lassi : 200/-");
//                 sum+=200;
//             }
//             else if(item==6) {
//                 System.out.print("chaae : 500/-");
//                 sum+=500;
//             }
//             else{
//                 sum+=0;
//                 break;
//             }
//         }
//         System.out.print("total: "+sum);

//         }       
       
//     }
// import java.util.*;

// public class first {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int sum = 0;
//         System.out.println("Dish 1 for Rs.100");
//         System.out.println("Dish 2 for Rs.200");
//         System.out.println("Dish 3 for Rs.300");
//         System.out.println("Dish 4 for Rs.400");
//         System.out.println("Dish 5 for Rs.500");
//         System.out.println("Dish 6 for Rs.600");

        // // int a = sc.nextInt();
        // Boolean flag = true;
        // for (int i = 0; flag; i++) {
        // int n = sc.nextInt();
        // if (n == 0) {
        // flag = false;
        // } else if (n == 1) {
        // System.out.println("You order dish1");
        // sum += 100;
        // } else if (n == 2) {
        // System.out.println("You order dish2");
        // sum += 200;
        // } else if (n == 3) {
        // System.out.println("You order dish3");
        // sum += 300;
        // } else if (n == 4) {
        // System.out.println("You order dish4");
        // sum += 400;
        // } else if (n == 5) {
        // System.out.println("You order dish5");
        // sum += 500;
        // } else if (n == 6) {
        // System.out.println("You order dish6");
        // sum += 600;
        // }
        // }
        // System.out.println("The total bill is: " + sum);

        // Boolean flag = true;
        // while (flag) {
        // int n = sc.nextInt();
        // if (n == 0) {
        // flag = false;
        // } else if (n == 1) {
        // System.out.println("You order dish1");
        // sum += 100;
        // } else if (n == 2) {
        // System.out.println("You order dish2");
        // sum += 200;
        // } else if (n == 3) {
        // System.out.println("You order dish3");
        // sum += 300;
        // } else if (n == 4) {
        // System.out.println("You order dish4");
        // sum += 400;
        // } else if (n == 5) {
        // System.out.println("You order dish5");
        // sum += 500;
        // } else if (n == 6) {
        // System.out.println("You order dish6");
        // sum += 600;
        // }
        // }
        // System.out.println("The total bill is: " + sum);

//         Boolean flag = true;
//         do {
//             int n = sc.nextInt();
//             if (n == 0) {
//                 flag = false;
//             } else if (n == 1) {
//                 System.out.println("You order dish1");
//                 sum += 100;
//             } else if (n == 2) {
//                 System.out.println("You order dish2");
//                 sum += 200;
//             } else if (n == 3) {
//                 System.out.println("You order dish3");
//                 sum += 300;
//             } else if (n == 4) {
//                 System.out.println("You order dish4");
//                 sum += 400;
//             } else if (n == 5) {
//                 System.out.println("You order dish5");
//                 sum += 500;
//             } else if (n == 6) {
//                 System.out.println("You order dish6");
//                 sum += 600;
//             }
//         } while (flag);
//         System.out.println("The total bill is: " + sum);
//     }
// }

///print the following pattern
///     *
///   * * *
/// * * * * *
///   * * *
///     *

// import java.util.Scanner;
// public class first{
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         for(int i=0;i<n;i++){
//             for(int s=0;s<n-i-1;s++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//         for(int i=0;i<n;i++){
//             for(int s=0;s<=i;s++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<n-(2*i);j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

// import java.util.Scanner;
// public class first{
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         for(int i=0;i<n;i++){
//             for(int s=0;s<n-i+1;s++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<2*i-2;j++){
//                 System.out.print(" ");
//             }
//             for(int s=0;s<n-i+1;s++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//         for(int i=0;i<n;i++){
//             for(int s=0;s<=i;s++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<n-(2*i);j++){
//                 System.out.print(" ");
//             }
//             for(int s=0;s<=i;s++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

///write a program to create a 1Darray of size 10 and add all the elements of the array.
// import java.util.*;
// public class first{
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         int arr[]=new int[10];
//         for(int i=0;i<10;i++){
//             arr[i]=scan.nextInt();
//         }
//         int sum=0;
//         for(int i=0;i<10;i++){
//             sum+=arr[i];
//         }
//         System.out.print(sum);
        
//     }
// }

///write a program to copy the elements of an array into another array.
// import java.util.*;
// public class first{
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         int arr[]=new int[n];
//         int arr1[]=new int[n];
//         for(int i=0;i<n;i++){
//             int arr[i]=scan.nextInt();
//         }
//         for( i=0;i<n;i++){
//             arr[i]=arr1[i];
//         }
//         System.out.print("elements of the second array are: ");
//         for(int i=0;i<n;i++){
//         System.out.print(arr1[i]);
//         }
//     }
// }

 
// import java.util.*;
// public class first{
//     public static void main(String[] args) {
//       Scanner scan=new Scanner(System.in);
//         int[] arr={2,7,11,15};
//         int target= scan.nextInt();
//         for(int i=0;i<4;i++){
//             for(int j=i+1;j<4;j++){
//                 if(arr[i]+arr[j]==target){
//                     System.out.println(i);
//                     System.out.print(j);
//                 }
//             }
//         }
//     }
// }

/*given an array of integers of size n-1 such that it only contains the integers in the range of 1 to N. 
 * find the nnissing element.*/
// import java.util.*;
// public class first{
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n-1;i++){
//            arr[i]=scan.nextInt();
//         }

//         for(int i=0;i<n-1;i++){
//             if((arr[i]+1)!=arr[i+1]){
//             System.out.println( arr[i]+1);
//             break;}
//         }

//     }
// }

/*Rotate an array after the element k */
// import java.util.*;
// public class first{
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         int[] arr={1, 2, 3, 4, 5 ,6};
//         int k=scan.nextInt();
//         for(int i=k;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         for(int i=0;i<k;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


/*given a matrix M of r rows and c columns.write a program to swap the first column with the last column*/

// import java.util.*;
// public class first{
//     static void swap(int x,int y){
//         int temp=x;
//         x=y;
//         y=temp;
//     }
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         int r=scan.nextInt();
//         int c=scan.nextInt();
//         int arr[][]=new int[r][c];
//         for(int i=0;i<r;i++){
//             for (int j=0;j<c;j++){
//                arr[i][j]=scan.nextInt();
//             }
//         }
        


//     }
// }
///methods ko define krna hi pdega declaration ke sath
///return statement braces close krne se pehli deni pdegi
///abstract keyword lagane se body chod skte han
/// static keyowrd se object ki zrurt ni 
/// if not static call krne k liye object.methodname(args)
// public class first{
//     class A{
//         int a;
//         int b;
//        A(int a,int b){
//             A.a=
//             System.out.println(a+b);
//        }
//     }
//     public static void main(String[] args) {
//         A ann= new A(2,3);
//     }
// }

//create a class called shape with a method called getArea() that returns the area of the shape.Create
// subclasses called rectangle and traingle that inherit from shape and override the getArea() method
// to calculate the area of a rectangle and triangle respectively.
// public class first{
// public abstract class Shape {
//     public abstract double getArea();
// }

// public class Rectangle extends Shape {
//     private double width;
//     private double height;

//     public Rectangle(double width, double height) {
//         this.width = width;
//         this.height = height;
//     }

//     @Override
//     public double getArea() {
//         return width * height;
//     }
// }

// public class Triangle extends Shape {
//     private double base;
//     private double height;

//     public Triangle(double base, double height) {
//         this.base = base;
//         this.height = height;
//     }

//    // @Override
//     public double getArea() {
//         return 0.5 * base * height;
//     }
    
// }
// public static void main(String[] args) {
//     Rectangle rectangle = new Rectangle(4, 5);
// System.out.println(rectangle.getArea());  // Output: 20.0

// Triangle triangle = new Triangle(4, 5);
// System.out.println(triangle.getArea());  // Output: 10.0
// }



// }

// class BankAccount:
//     def __init__(self, accountNumber, balance, interestRate):
//         self.accountNumber = accountNumber
//         self.balance = balance
//         self.interestRate = interestRate

// class CheckingAccount(BankAccount):
//     def __init__(self, accountNumber, balance, interestRate, overdraftLimit):
//         super().__init__(accountNumber, balance, interestRate)
//         self.overdraftLimit = overdraftLimit

// class SavingsAccount(BankAccount):
//     def __init__(self, accountNumber, balance, interestRate, minBalance):
//         super().__init__(accountNumber, balance, interestRate)
//         self.minBalance = minBalance

///dynamic mthod dispatch 
///upcasting'
/* if the input is integers and float, add the two and if string concatenate */

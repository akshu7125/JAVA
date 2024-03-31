package JAVA;
import java.util.*;

public class roundOff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%10;
        int ans=0;
        if(last==0){
            System.out.println("n");
        }
        else{
            if(last>=5){
                 ans=(((n/10)*10)+10);
            }
            else
            ans=((n/10)*10);
        }
        System.out.println(ans);
    }
}

package JAVA;
public class fibonacci {
    static public int fact(int n){
        if(n==1||n==0)
        return 1;
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.printf("%d",fact(n));
        
    }
}

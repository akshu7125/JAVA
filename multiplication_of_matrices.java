
//package JAVA;
public class multiplication_of_matrices {
    public static void main(String[] args) {
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2={{10,20,30},{40,50,60},{70,80,90}};
        int[][] product = new int[3][3];
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                sum[i][j]+= arr1[i][k]+ arr2[k][j];
                }
            }

        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }

    }
}

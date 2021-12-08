import java.util.*;

public class MatrixProduct {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int r1, c1, r2, c2;
        System.out.println("Enter the number of rows and columns in the first matrix: ");
        r1 = scanner.nextInt();
        c1 = scanner.nextInt();
        System.out.println("Enter the number of rows and columns in the second matrix: ");
        r2 = scanner.nextInt();
        c2 = scanner.nextInt();
        if(c1!=r2){
            System.out.println("The matrices cannot be multiplied");
        }
        else{
            int[][] matrix1 = new int[r1][c1];
            int[][] matrix2 = new int[r2][c2];
            System.out.println("Enter the elements of the first matrix: ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    matrix1[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Enter the elements of the second matrix: ");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    matrix2[i][j] = scanner.nextInt();
                }
            }
            int[][] result = new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        result[i][j] += matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
            System.out.println("The result of the multiplication is: ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}

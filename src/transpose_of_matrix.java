import java.util.*;

public class transpose_of_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("row ypu want: ");
        int row = sc.nextInt();
        System.out.println("columns you want: ");
        int col = sc.nextInt();
        int[][] matrix= new int[row][col];
        System.out.println("give the elements of the matrix:");
        //inserting elements of a matrix by taking input from the user
        for (int i = 0; i< row; i++){
            for (int j = 0; j< col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("the matrix is ");
        //printing matrix
        for (int i = 0; i< row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int [][] b = new int[col][row];
        for (int i = 0; i<col; i++){
            for (int j = 0; j<row; j++){
                b[i][j]= matrix[j][i];
                System.out.print(b[i][j] + ", ");
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class spiral_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int row_start = 0;
        int row_end = row-1;
        int col_start = 0;
        int col_end = col- 1;
        int[][] matrix = new int[row][col];
        for (int i = 0; i< row; i++){
            for (int j = 0; j< col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("the matrix is ");
        for (int i = 0; i< row; i++){
            for (int j = 0; j< col; j++){
                System.out.println(matrix[i][j] + " ");;
            }
            System.out.println();
        }
        System.out.println("the spiral matrix form of the given matrix is:");

    }
}

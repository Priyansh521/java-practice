import java.util.*;

public class matrix_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][]  elements = new int[row][col];
        for (int i = 0; i<row; i++){
            for (int j = 0 ; j< col; j++){
                elements[i][j] = sc.nextInt();
            }
        }
        System.out.println(" Tell me the number you have to find: ");
        int x = sc.nextInt();
        for (int i = 0; i<row; i++){
           for (int j = 0 ; j< col; j++){
               if ( x == elements[i][j]){
                   System.out.println("the given number is present in the 2-d array and its index is " + i +", " + j);
               }
           }
        }
    }
}

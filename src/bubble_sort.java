import java.util.Scanner;

public class bubble_sort {
    public static void printArray(int array[]){
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what size of an array do you want");;
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("give your input for array");
        for (int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0; i<n-1; i++){
            for (int j= 0; j<n-i-1; j++){
               if (array[j]>array[j+1]){
                   int temp = array[j];
                    array[j] = array[j+1];
                   array[j+1] = temp;
               }
            }
        }
        printArray(array);
    }
}

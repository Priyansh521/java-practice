import java.util.Scanner;

public class max_min_inarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of array you need: ");
        int x = sc.nextInt();
        int[] numbers = new int[x];
        System.out.println("Input the elements of the array");
        for (int i= 0 ; i< x; i++){
            numbers[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : numbers){
            if (number > max){
                max = number;
            }
            if (number<min){
                min = number;
            }
        }
        System.out.println("The minimum number is " + min);
        System.out.println("The minimum number is " + max);
    }
}

import java.util.Scanner;

public class sum_using_recursion {
    public static void sum(int n, int summation){
        if (n == 0){
            System.out.println(summation);
            return;
        }
        summation +=n;
        sum(n-1, summation);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int summation = 0 ;
        sum(n, summation);
    }
}

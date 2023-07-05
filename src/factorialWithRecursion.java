import java.util.Scanner;

public class factorial_using_recursion {
    public static void Factorial(int n , int factorial){
        if (n ==0){
            System.out.println(factorial);
            return;
        }
        factorial *= n;
        Factorial( n-1, factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        Factorial(n, factorial);
    }
}

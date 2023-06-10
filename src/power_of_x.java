import java.util.Scanner;

public class power_of_x {
    public static void raiseToThePower(int x , int n){
        int product = 1;
        for (int i=1; i<=n; i++){
            product *= x;
        }
        System.out.println(product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        raiseToThePower(x, n);
    }
}

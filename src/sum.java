import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write two numbers you want the sum for");
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of the numbers is:" + sum);
    }
}

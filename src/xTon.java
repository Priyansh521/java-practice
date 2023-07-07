import java.util.Scanner;
public class xRaiseToN {
    public static int power(int x, int n, int res){
        if (x ==0|| n ==0){
            return res;
        }
        res *= x;
        return power(x, n-1, res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int res = 1;
        System.out.println(power(x, n,res));
    }
}

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1= 0;
        int n2= 1;
        System.out.print(n1 +","+ n2);
        for (int i = 2; i<n; i++){
            int nextnum = (n1+n2);
            System.out.print(","+ nextnum);
            n1 = n2;
            n2 = nextnum;
        }
    }
}

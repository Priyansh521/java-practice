import java.util.Scanner;
public class natural_sum{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("table of ");
        n = sc.nextInt();
        for(int i = 1; i<=10; i++){
            int table = n*i ;
            System.out.println(table);
        }

    }
}
